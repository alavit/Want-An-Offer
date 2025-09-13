package main.java.practice_6.array_deque;

import java.util.ArrayDeque;

public class Task3 {
    public static void main(String[] args) {
        ArrayDeque<String> queue = new ArrayDeque<>();
        queue.add("first");
        queue.add("second");
        queue.add("third");
        queue.addFirst("zero"); // zero, first, second, third
        queue.removeFirst();
        queue.removeLast();
        System.out.println(queue); // first, second
    }
}
