package main.java.practice_8.part_3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(45, 3, 19, 27, 51, 10);
        Optional<Integer> result = numbers.stream()
                .min(Integer::compareTo);
        System.out.println("Min number: " + result.get());
    }
}
