package main.java.practice_4.do_while;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String password = "God123";
        String userInput;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter Your Password: ");
            userInput = scanner.next();
        }
        while (!userInput.equals(password));
    }

}
