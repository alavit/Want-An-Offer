package practice_10;

import java.util.Arrays;

public class Task4 {

    public int findMax(int[] numbers) {
        return Arrays.stream(numbers).max().orElseThrow();
    }
}
