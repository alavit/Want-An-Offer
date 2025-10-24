package practice_8.part_4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Double averageInt = numbers.stream()
                .collect(Collectors.averagingInt(n -> n));

        System.out.println("Average value: " + averageInt);
    }
}
