package practice_7.exceptions.task4;

import java.util.Scanner;

import static practice_7.exceptions.task4.Task4.validateEmailAddress;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter email address: ");
        String email = input.nextLine();
        validateEmailAddress(email);
    }
}
