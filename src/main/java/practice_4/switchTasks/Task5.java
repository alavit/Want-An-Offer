package practice_4.switchTasks;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter math operator: ");
        String operator = scanner.nextLine();
        System.out.println("Enter 1st number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = scanner.nextInt();


        int result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    result = -1; // denominator is 0
                }
                break;
        }
        System.out.println(result);
    }
}
