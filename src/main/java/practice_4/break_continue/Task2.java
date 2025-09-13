package main.java.practice_4.break_continue;

public class Task2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i + "");
        }
    }
}
