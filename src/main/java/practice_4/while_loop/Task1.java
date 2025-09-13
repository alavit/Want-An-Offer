package main.java.practice_4.while_loop;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int factorial = 1;
        int i = 1;
        while ( i <= number ) {
            factorial *= i;
            i++;
        }
        System.out.println(number + "! = " + factorial);
    }
}
