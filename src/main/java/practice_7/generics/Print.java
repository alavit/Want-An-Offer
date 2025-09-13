package main.java.practice_7.generics;

import java.util.ArrayList;

public class Print {
    public static <T> void printArray(ArrayList<T> list) {
        System.out.println(list);
    }
}
