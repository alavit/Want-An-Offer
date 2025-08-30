package practice_7.exceptions;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        try {
            System.out.println(num1 / num2);
        }
        catch (ArithmeticException e) {
            System.err.println("Dvision by zero is not allowed");
        }
    }
}
