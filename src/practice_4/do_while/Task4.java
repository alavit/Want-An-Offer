package practice_4.do_while;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String command;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a command: ");
            command = scanner.nextLine();
        }
        while (!command.equals("exit"));
    }
}
