package practice_8.part_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 7, 2, 3, 7, 2, 1, 5);
        List<Integer> unique = list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(unique);
    }
}
