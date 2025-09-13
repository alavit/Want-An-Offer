package main.java.practice_4.break_continue;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            if (number < 0) {
                continue;
            }
            if (number == 0) {
                break;
            }
            System.out.println(number);
        }
    }
}
