package practice_10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task3Test {

    /*
        Обычные строки
        Пустую строку
        null (должно возвращаться null)
    */
    public static Stream<Arguments> stringsForPositiveCases() {
        return Stream.of(
                Arguments.of("hello", "olleh"),
                Arguments.of("WORLD", "DLROW"),
                Arguments.of("a", "a"),
                Arguments.of("12345", "54321"),
                Arguments.of("", ""),
                Arguments.of(null, null)
        );
    }

    @ParameterizedTest
    @MethodSource("stringsForPositiveCases")
    void userCanReverseStringPositiveCases(String initialString, String expectedReversedString) {
        Task3 stringReverser = new Task3();

        String actualReversedString = stringReverser.reverse(initialString);

        assertEquals(expectedReversedString, actualReversedString);
    }
}
