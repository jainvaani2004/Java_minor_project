import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Movie[] movies = {
            new Movie("Avengers: Endgame", 180),
            new Movie("Inception", 150),
            new Movie("Interstellar", 170),
            new Movie("The Dark Knight", 152),
            new Movie("Spider-Man: No Way Home", 148),
            new Movie("Titanic", 195),
            new Movie("Avatar: The Way of Water", 192),
            new Movie("Joker", 122),
            new Movie("Black Panther: Wakanda Forever", 161),
            new Movie("Doctor Strange in the Multiverse of Madness", 126)
        };

        Theatre theatre = new Theatre(movies);
        Scanner sc = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("     🎬  WELCOME TO VJ CINEMA BOOKING  🎬");
        System.out.println("========================================");

        while (true) {
            System.out.println("\n--------- MAIN MENU ---------");
            System.out.println("1. Show Movies");
            System.out.println("2. Book Normal Seat");
            System.out.println("3. Book VIP Seat");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("⚠️ Please enter a valid number!");
                sc.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    theatre.showMovies();
                    System.out.print("\nPress ENTER to return to menu...");
                    sc.nextLine();
                    sc.nextLine();
                    break;

                case 2:
                    bookSeat(sc, theatre, false);
                    break;

                case 3:
                    bookSeat(sc, theatre, true);
                    break;

                case 4:
                    System.out.println("👋 Thank you for visiting! Have a great day.");
                    sc.close();
                    return;

                default:
                    System.out.println("⚠️ Invalid choice, please try again.");
            }
        }
    }

    private static void bookSeat(Scanner sc, Theatre theatre, boolean isVIP) {
        theatre.showMovies();
        System.out.print("Enter the movie number to book: ");
        int movieChoice = sc.nextInt();
        Movie selectedMovie = theatre.getMovie(movieChoice);

        if (selectedMovie == null) {
            System.out.println("⚠️ Invalid movie selection!");
            return;
        }

        System.out.print("Enter Seat Number: ");
        int seatNumber = sc.nextInt();

        Seat seat = isVIP ? new VIPSeat(seatNumber) : new NormalSeat(seatNumber);
        ((Bookable) seat).book();

        if (seat.isBooked()) {
            Ticket ticket = new Ticket(selectedMovie, seat);
            System.out.println("\n----- YOUR TICKET -----");
            ticket.displayTicket();
            System.out.println("-----------------------");
        }
    }
}
