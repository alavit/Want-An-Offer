package main.java.practice_6.array_list;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(7, 4, 9, 15, 3));
       Collections.sort(list);
       System.out.println(list.get(list.size()-1));
    }
}
