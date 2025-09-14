package practice_10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task7Test extends Task7ParentTest {

    /*
        0! = 1
        Маленькие числа (1!, 5!, 7!)
        Отрицательные числа (должно выбрасываться исключение)
    */
    public static Stream<Arguments> numbersForPositiveCases() {
        return Stream.of(
                // small numbers
                Arguments.of(1, 1),
                Arguments.of(5, 120),
                Arguments.of(7, 5040),
                // corner case
                Arguments.of(0, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("numbersForPositiveCases")
    void userCanCalculateFactorial(int number, int expectedResult) {
        int actualResult = factorialCalculator.factorial(number);

        assertEquals(expectedResult, actualResult, "Expected result: " + expectedResult + ", but actual result: " + actualResult);
    }

    @Test
    void userCannotCalculateFactoriaIfNumberIsNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            factorialCalculator.factorial(-5);
        }, "Reversing of null string should lead to IllegalArgumentException");
    }
}