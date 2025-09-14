package practice_10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task1Test extends Task1ParentTest {

    /*
        Чётные и нечётные числа
        Нулевое значение
        Отрицательные числа
    */
    public static Stream<Arguments> numbersForPositiveCases() {
        return Stream.of(
                Arguments.of(2),
                Arguments.of(0),
                Arguments.of(-6)
        );
    }

    @ParameterizedTest
    @MethodSource("numbersForPositiveCases")
    void userCanCheckIfNumberIsEven(int number) {
        boolean actualResult = numberProcessor.isEven(number);

        assertTrue(actualResult, "The number " + number + " is odd");
    }

    public static Stream<Arguments> numbersForNegativeCases() {
        return Stream.of(
                Arguments.of(1),
                Arguments.of(-5)
        );
    }

    @ParameterizedTest
    @MethodSource("numbersForNegativeCases")
    void userCanCheckIfNumberIsOdd(int number) {
        boolean actualResult = numberProcessor.isEven(number);

        assertFalse(actualResult, "The number " + number + " is even");
    }
}
