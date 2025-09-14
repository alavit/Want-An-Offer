package practice_10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task2Test extends Task2ParentTest {
    /**
     * Разные строки ("hello", "java", "AEIOU", "")
     * null (должно выбрасываться исключение)
     * Строки без гласных
     */

    public static Stream<Arguments> stringsForPositiveCases() {
        return Stream.of(
                Arguments.of("hello", 2),
                Arguments.of("java", 2),
                Arguments.of("AEIOU", 5),
                Arguments.of("", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("stringsForPositiveCases")
    void userCanCountVowelsInStringPositiveCases(String str, int expectedCount) {
        int actualCount = stringProcessor.countVowels(str);

        assertEquals(expectedCount, actualCount, "Expected vowels count: " + expectedCount + " , but actual vowels count: " + actualCount);
    }

    public static Stream<Arguments> stringsForNegativeCases() {
        return Stream.of(
                Arguments.of("qwrtz", 0),
                Arguments.of("SDFGHJK", 0),
                Arguments.of("12345", 0),
                Arguments.of("!§$%&()?<>_-,.", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("stringsForNegativeCases")
    void userCanCountVowelsInStringNegativeCases(String str, int expectedCount) {
        int actualCount = stringProcessor.countVowels(str);

        assertEquals(expectedCount, actualCount, "Expected vowels count: " + expectedCount + " , but actual vowels count: " + actualCount);
    }

    @Test
    void userCannotCountVowelsIfStringIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            stringProcessor.countVowels(null);
        }, "Counting vowels in Null string should lead to IllegalArgumentException");
    }
}
