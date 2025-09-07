package practice_8.part_3;

import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9, 10);
        boolean ifContainsEvenNum = numbers.stream()
                .anyMatch(n -> n % 2 == 0);
        System.out.println("Contains even number? " + ifContainsEvenNum);
    }
}
