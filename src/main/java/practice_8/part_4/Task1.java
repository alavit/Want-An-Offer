package main.java.practice_8.part_4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Alphabet", "Zumba", "Fitness", "Alaska", "Fiber");
        Map<Character, List<String>> grouped = strings.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));

        System.out.println(grouped);
    }
}
