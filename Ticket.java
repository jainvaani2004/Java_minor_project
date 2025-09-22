public class Ticket {
    private Movie movie;
    private Seat seat;

    public Ticket(Movie movie, Seat seat) {
        this.movie = movie;
        this.seat = seat;
    }

    public void displayTicket() {
        System.out.println("🎟️ Ticket Details:");
        System.out.println("Movie: " + movie.getTitle());
        System.out.println("Seat Number: " + seat.getSeatNumber());
        System.out.println("Seat Price: ₹" + seat.getPrice());
    }
}
