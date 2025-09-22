public class Theatre {
    private Movie[] movies;

    public Theatre(Movie[] movies) {
        this.movies = movies;
    }

    public void showMovies() {
        System.out.println("\n📽️ Movies Available:");
        for (int i = 0; i < movies.length; i++) {
            System.out.print((i + 1) + ". ");
            movies[i].displayMovie();
        }
    }

    public Movie getMovie(int choice) {
        if (choice > 0 && choice <= movies.length) {
            return movies[choice - 1];
        }
        return null;
    }
}
