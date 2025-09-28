package complex_tasks.task_4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MoveServiceTest extends BaseTest {
    private final Movie TERMINATOR = new Movie("Terminator", 1981, "Cameron", "action");
    private final Movie TITANIC = new Movie("Titanic", 1999, "Cameron", "drama");

        /*    Test cases:
            negative:
                - rating is -1.0 --> InvalidRatingException
                - rating is 0  --> InvalidRatingException
                - rating is 11  --> InvalidRatingException
            positive:
                - rating is 1 --> rating is added
                - rating is 1.5 --> rating is added
                - rating is 10 --> rating is added
                - add 2 ratings --> average rating is calculated
                - add 2 movies with 2 ratings each -> movies are sorted by rating
     */

    public static Stream<Arguments> numbersForNegativeCases() {
        return Stream.of(
                Arguments.of(-1.0),
                Arguments.of(0),
                Arguments.of(11)
        );
    }

    @ParameterizedTest
    @MethodSource("numbersForNegativeCases")
    void userCannotAddInvalidRating(Number number) throws InvalidRatingException {
        assertThrows(InvalidRatingException.class, () -> {
            service.addRating(TERMINATOR, new Rating(number));
        }, "Rating cannot be negative");
    }

    public static Stream<Arguments> numbersForPositiveCases() {
        return Stream.of(
                Arguments.of(1),
                Arguments.of(1.5),
                Arguments.of(10)
        );
    }

    @ParameterizedTest
    @MethodSource("numbersForPositiveCases")
    void userCanAddValidRating(Number number) throws InvalidRatingException {
        service.addRating(TERMINATOR, new Rating(number));

        assertEquals(1, service.getMovies().get(TERMINATOR).size());
        assertEquals(number, service.getMovies().get(TERMINATOR).get(0).getRating());
    }

    @Test
    void userCanCalculateMovieAverageRating() throws InvalidRatingException {
        service.addRating(TERMINATOR, new Rating(5.0));
        service.addRating(TERMINATOR, new Rating(4.5));

        double actualAverageRating = service.countAverageRating(TERMINATOR);

        assertEquals(4.75, actualAverageRating);
    }

    @Test
    void userCanSortMoviesByRating() throws InvalidRatingException {
        service.addRating(TERMINATOR, new Rating(4.7));
        service.addRating(TERMINATOR, new Rating(4.5));

        service.addRating(TITANIC, new Rating(5.0));
        service.addRating(TITANIC, new Rating(4.9));

        List<Movie> moviesSorted = service.sortMoviesByRating();
        assertEquals(2, moviesSorted.size());
        assertEquals(TITANIC, moviesSorted.get(0));
        assertEquals(TERMINATOR, moviesSorted.get(1));
    }
}
