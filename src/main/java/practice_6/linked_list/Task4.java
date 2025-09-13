package main.java.practice_6.linked_list;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        System.out.println("Sum: " + sum);
    }
}
