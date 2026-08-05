package ComplexTask.Task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MovieService {
    private Map<Movie, List<Rating>> storageMovie;
    public static void addRatingToMovie(Movie movie, Rating rating){

    }

    public void addMovieToStorageMovie(Movie movie){
        try {
            if(this.storageMovie.containsKey(movie) || movie == null){
                throw new IllegalArgumentException;
            }
        }
        catch (IllegalArgumentException e){
            System.out.println("Такой фильм не может быть добавлен");
        }
        storageMovie.put(movie,new ArrayList<>());
    }
}
