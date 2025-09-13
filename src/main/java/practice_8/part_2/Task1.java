package main.java.practice_8.part_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("foo", "bar","museum", "baz", "hello", "crocodile");
        List<String> filtered = strings.stream()
                .filter(str -> str.length() > 5)
                .collect(Collectors.toList());
        System.out.println(filtered);
    }
}
