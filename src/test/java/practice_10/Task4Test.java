package practice_10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task4Test extends Task4ParentClass {

/*
    Обычный массив ([3, 5, 7, 2])
    Один элемент в массиве
    Отрицательные числа
    Пустой массив (должно выбрасываться исключение)
 */

    public static Stream<Arguments> arraysForPositiveCases() {
        return Stream.of(
                Arguments.of(new int[]{3, 5, 7, 2}, 7),
                Arguments.of(new int[]{1}, 1),
                Arguments.of(new int[]{-2, -5, -7, -10}, -2)
        );
    }

    @ParameterizedTest
    @MethodSource("arraysForPositiveCases")
    void userCanFindMaxNumberInArray(int[] array, int expectedMax) {
        int actualMax = maxFinder.findMax(array);

        assertEquals(expectedMax, actualMax, "Expected max value: " + expectedMax + ", but the actual max value: " + actualMax);
    }

    @Test
    void userCannotFindMaxNumberIfArrayIsEmpty() {
        assertThrows(NoSuchElementException.class, () -> {
            maxFinder.findMax(new int[]{});
        }, "Finding max element in empty array should lead to NoSuchElementException");
    }

    @Test
    void userCannotFindMaxNumberIfArrayIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            maxFinder.findMax(null);
        }, "Finding max element in Null array should lead to IllegalArgumentException"); // FAIL
    }
}