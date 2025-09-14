package practice_10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task10Test extends Task10ParentTest {

    /*
        Корректные номера ("+1 1234567890")
        Некорректные номера ("12345", "invalid")
    */
    public static Stream<Arguments> phoneNumbersForPositiveCases() {
        return Stream.of(
                Arguments.of("+1 1234567890", true),
                Arguments.of("+7 9201234567", true)
        );
    }

    @ParameterizedTest
    @MethodSource("phoneNumbersForPositiveCases")
    void userCanValidateValidPhoneNumber(String phoneNumber, boolean expectedResult) {
        boolean actualResult = phoneNumberValidator.isValidPhoneNumber(phoneNumber);

        assertEquals(expectedResult, actualResult, "Expected result: " + expectedResult + ", but actual result: " + actualResult);
    }

    public static Stream<Arguments> phoneNumbersForNegativeCases() {
        return Stream.of(
                // without country code
                Arguments.of("1234567890", false),
                // only letters
                Arguments.of("invalid", false),
                // country code and letters
                Arguments.of("+1 abcdefghij", false),
                // empty string
                Arguments.of("", false)

        );
    }

    @ParameterizedTest
    @MethodSource("phoneNumbersForNegativeCases")
    void userCannotValidateInvalidPhoneNumber(String phoneNumber, boolean expectedResult) {
        boolean actualResult = phoneNumberValidator.isValidPhoneNumber(phoneNumber);

        assertEquals(expectedResult, actualResult, "Expected result: " + expectedResult + ", but actual result: " + actualResult);
    }

    @Test
    void userCannotValidateIfPhoneNumberIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            phoneNumberValidator.isValidPhoneNumber(null);
        }, "Validation of Null phone number lead to IllegalArgumentException"); // FAIL

    }
}
