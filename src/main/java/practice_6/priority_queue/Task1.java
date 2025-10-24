package practice_6.priority_queue;

import java.util.PriorityQueue;

public class Task1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(3);
        queue.add(17);
        queue.add(12);
        queue.add(61);
        System.out.println(queue);
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
