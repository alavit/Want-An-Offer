package practice_10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task9Test extends Task9ParentTest {

    /*
        Пустую строку
        null
        Строку с несколькими пробелами
    */
    public static Stream<Arguments> stringsForPositiveCases() {
        return Stream.of(
                // normal strings
                Arguments.of("mom eats an apple", 4),
                Arguments.of("cat", 1),
                // corner case: empty string
                Arguments.of("", 0),
                // corner case: string with one space
                Arguments.of(" ", 0),
                // corner case: string with excessive spaces
                Arguments.of(" Java is awesome ", 3) // FAIL
        );
    }

    @ParameterizedTest
    @MethodSource("stringsForPositiveCases")
    void userCanCountWordsInString(String str, int expectedResult) {
        int actualResult = wordCounter.countWords(str);

        assertEquals(expectedResult, actualResult, "Expected result: " + expectedResult + ", but actual result: " + actualResult);
    }

    @Test
    void userCannotCountWordsIfStringIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            wordCounter.countWords(null);
        }, "Counting words in a Null string should lead to IllegalArgumentException"); // FAIL
    }
}
