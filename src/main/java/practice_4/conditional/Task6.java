package main.java.practice_4.conditional;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter test result: ");
        int result = scanner.nextInt();

        String mark;
        if (result >= 90) {
            mark = "Отлично";
        } else if (result >= 75 && result <= 89) {
            mark = "Хорошо";
        } else if (result >= 60 && result <= 74) {
            mark = "Удовлетворительно";
        } else {
            mark = "Неудовлетворительно";
        }
        System.out.println("Оценка теста: " + mark);
    }
}
