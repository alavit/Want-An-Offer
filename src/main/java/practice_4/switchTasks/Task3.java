package practice_4.switchTasks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number form 0 to 100: ");
        int number = scanner.nextInt();

        String mark = "no mark";
        if (number >= 90 && number <= 100) {
            mark = "A";
        } else if (number >= 80 && number <= 89) {
            mark = "B";
        } else if (number >= 70 && number <= 79) {
            mark = "C";
        } else if (number >= 60 && number <= 69) {
            mark = "D";
        } else if (number < 60) {
            mark = "F";
        }
        System.out.println("Mark: " + mark);
    }
}
