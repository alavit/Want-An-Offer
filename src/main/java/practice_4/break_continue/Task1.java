package main.java.practice_4.break_continue;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();

            if (number < 0) {
                break;
            }
            sum += number;
        }
        System.out.println("Sum: " + sum);
    }
}
