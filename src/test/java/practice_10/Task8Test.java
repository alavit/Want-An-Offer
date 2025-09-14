package practice_10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task8Test extends Task8ParentTest {

    /*
        Обычные массивы
        Массив с одинаковыми числами
        Один элемент в массиве (должно выбрасываться исключение)
    */
    public static Stream<Arguments> arraysForPositiveCases() {
        return Stream.of(
                // normal arrays
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 4),
                Arguments.of(new int[]{-3, -5, 3, 5,}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("arraysForPositiveCases")
    void userCanFindSecondMaxInArray(int[] array, int expectedResult) {
        int actualResult = secondMaxFinder.findSecondMax(array);

        assertEquals(expectedResult, actualResult, "Expected result: " + expectedResult + ", but actual result: " + actualResult);
    }

    public static Stream<Arguments> arraysForNegativeCases() {
        return Stream.of(
                // corner case: the array with one number
                Arguments.of(new int[]{1}),
                // corner case: empty array
                Arguments.of(new int[]{})
        );
    }

    @ParameterizedTest
    @MethodSource("arraysForNegativeCases")
    void userCannotFindSecondMaxInArrayNegativeCases(int[] array) {
        assertThrows(IllegalArgumentException.class, () -> {
            secondMaxFinder.findSecondMax(array);
        }, "Finding second max in array " + Arrays.toString(array) + " should lead to IllegalArgumentException");
    }

    @Test
    void userCannotFindSecondMaxInArrayWithTheSameNumbers() {
        assertThrows(NoSuchElementException.class, () -> {
            secondMaxFinder.findSecondMax(new int[]{1, 1, 1, 1});
        }, "Finding second max in array with the same numbers should lead to NoSuchElementException");
    }
}
