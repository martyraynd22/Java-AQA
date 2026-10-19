package ComplexTasks.Task4;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Том и Джерри");
        Movie movie2 = new Movie("Титаник");
        Rating<Double> rating1 = new Rating<>(3.0);
        Rating<Double> rating2 = new Rating<>(2.0);
        Rating<Double> rating3 = new Rating<>(7.0);
        Rating<Double> rating4 = new Rating<>(9.0);

        MovieService<Double> movieSevice = new MovieService<>();
        movieSevice.addRatingToMovie(movie1,rating1);
        movieSevice.addRatingToMovie(movie1,rating2);
        movieSevice.addRatingToMovie(movie1,rating4);
        movieSevice.addRatingToMovie(movie2,rating1);
        movieSevice.addRatingToMovie(movie2,rating2);
        movieSevice.addRatingToMovie(movie2,rating3);


        System.out.println(movieSevice.getMovies());
        System.out.println(movieSevice.avgRatingMovie());

    }
}
