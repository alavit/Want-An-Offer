package main.java.practice_4.conditional;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        int max = 0;
        if (num1 > num2) {
            max = num1;
        }
        else {
            max = num2;
        }
        System.out.println("Maximum number is: " + max);
    }
}
