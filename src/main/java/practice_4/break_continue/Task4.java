package practice_4.break_continue;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a string: ");
            String str = scanner.nextLine();

            if (str.equals("stop")) {
                break;
            }
        }
    }
}
