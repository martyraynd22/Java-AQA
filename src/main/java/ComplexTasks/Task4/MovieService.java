package ComplexTasks.Task4;

import java.util.*;
import java.util.stream.Collectors;

public class MovieService<T extends Number>{
    private Map<Movie, List<Rating>> movies;

    public MovieService() {
        this.movies = new HashMap<>();
    }

    public Map<Movie, List<Rating>> getMovies() {
        return movies;
    }

    public synchronized void addRatingToMovie(Movie movie, Rating<T> rating){
        if(movie == null || rating == null){
            throw new IllegalArgumentException("Оценка или Фильм не могут быть null");
        }
        double valueRating = rating.rating().doubleValue();
        if (valueRating < 1 || valueRating > 10){
           throw new IllegalArgumentException("Оценка фильма не вилидна");
        }
        this.movies.computeIfAbsent(movie,r -> new ArrayList<>()).add(rating);

    }

    public Map<Movie,Double> avgRatingMovie(){
        if (movies.isEmpty()){
            throw new NoSuchElementException("Нельзя найти среднюю оценку у пустого фильма");
        }
        return this.movies.entrySet()
                .stream()
                .collect(Collectors.toMap
                        (Map.Entry ::getKey,
                                e -> {double avg = e.getValue()
                                        .stream()
                                        .mapToDouble(r -> r.rating().doubleValue())
                                        .average()
                                        .orElse(0.0);
                            return Math.round(avg * 100.0) / 100.0;
                        }));

    }
}
