package main.java.practice_8.part_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("foo", "hello", "world", "dinosaur");
        List<Integer> lengths = list.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(lengths);
    }
}
