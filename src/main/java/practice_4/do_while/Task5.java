package practice_4.do_while;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ecnter a whole number: ");
        int number = scanner.nextInt();
        int count = 0;

        do {
            if (number == 0) {
                break;
            }
            number = number / 10;
            count++;
        }
        while (number > 0);
        System.out.println("Count:  " + count);
    }
}
