package complex_tasks.task_4;

import java.util.*;
import java.util.stream.Collectors;

public class MovieService {
    private List<Rating> ratingsList = new ArrayList<>();
    private Map<Movie, List<Rating>> movies = new HashMap<>();;

    public Map<Movie, List<Rating>> getMovies() {
        return movies;
    }

    public synchronized void addRating(Movie movie, Rating rating) throws InvalidRatingException {
        if (rating.getRating().intValue() >= 1 && rating.getRating().intValue() <= 10) {
            ratingsList.add(rating);
            movies.put(movie, ratingsList);
        }
        else throw new InvalidRatingException("Invalid rating");
    }

    public double countAverageRating(Movie movie) {
        return movies
                .get(movie)
                .stream()
                .mapToDouble(r -> r.getRating().doubleValue())
                .average()
                .orElse(Double.NaN);
    }

    public List<Movie> sortMoviesByRating() {
        return movies
                .entrySet()
                .stream()
                .sorted(Comparator.comparingDouble(movie -> countAverageRating(movie.getKey())))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
