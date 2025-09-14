package practice_10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task5Test extends Task5ParentTest {

/*
    Обычные годы
    Високосные (2020, 2000, 1600)
    Года, которые делятся на 100, но не на 400 (1900, 2100)
*/

    public static Stream<Arguments> leapYearsForPositiveCases() {
        return Stream.of(
                // normal leap years
                Arguments.of(2020, true),
                Arguments.of(2000, true),
                Arguments.of(1600, true),
                // leap years corner cases
                Arguments.of(0, true),
                Arguments.of(4, true),
                Arguments.of(400, true)
        );
    }

    @ParameterizedTest
    @MethodSource("leapYearsForPositiveCases")
    void userCanCheckIfYearIsLeap(int year, boolean expectedResult) {
        boolean actualResult = yearChecker.isLeapYear(year);

        assertEquals(expectedResult, actualResult, "Expected result: " + expectedResult + ", but actual result: " + actualResult);
    }

    public static Stream<Arguments> nonleapYearsForNegativeCases() {
        return Stream.of(
                // normal non-leap years
                Arguments.of(2027, false),
                Arguments.of(2025, false),
                Arguments.of(2023, false),
                // non-leap years that are divided by 100, but NOT divided by 400
                Arguments.of(1900, false),
                Arguments.of(2100, false)
        );
    }

    @ParameterizedTest
    @MethodSource("nonleapYearsForNegativeCases")
    void userCanCheckIfYearIsNotLeap(int year, boolean expectedResult) {
        boolean actualResult = yearChecker.isLeapYear(year);

        assertEquals(expectedResult, actualResult, "Expected result: " + expectedResult + ", but actual result: " + actualResult);
    }
}
