package practice_4.do_while;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
        }
        while (number <= 0);
    }
}
