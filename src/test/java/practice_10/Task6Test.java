package practice_10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task6Test extends Task6ParentTest {

/*
    Корректные и некорректные email ("test@example.com", "bad@.com", "no-at-symbol")
    null
*/

    public static Stream<Arguments> emailsForPositiveCases() {
        return Stream.of(
                // normal leap years
                Arguments.of("test@example.com", true),
                Arguments.of("qwerty123@hardvard.edu", true)
        );
    }

    @ParameterizedTest
    @MethodSource("emailsForPositiveCases")
    void userCanValidateValidEmail(String email, boolean expectedResult) {
        boolean actualResult = emailValidator.isValidEmail(email);

        assertEquals(expectedResult, actualResult, "Expected result: " + expectedResult + ", but actual result: " + actualResult);
    }

    public static Stream<Arguments> emailsForNegativeCases() {
        return Stream.of(
                // normal leap years
                Arguments.of("bad@.com", false),
                Arguments.of("no-at-symbol", false),
                Arguments.of("", false),
                Arguments.of(null, false)
        );
    }

    @ParameterizedTest
    @MethodSource("emailsForNegativeCases")
    void userCanValidateInvalidEmail(String email, boolean expectedResult) {
        boolean actualResult = emailValidator.isValidEmail(email);

        assertEquals(expectedResult, actualResult, "Expected result: " + expectedResult + ", but actual result: " + actualResult);
    }
}