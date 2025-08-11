package practice_4.switchTasks;

/*Задача:
Определите стоимость билета в кино:
будние дни (1–5) — 300 рублей
выходные (6–7) — 450 рублей
Методы и конструкции:
Scanner
switch-case (можно несколько case подряд) или if-else
        System.out.println()*/

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day of week: ");
        int dayOfWeek = scanner.nextInt();

        int ticketPrice = switch (dayOfWeek) {
            case 1, 2, 3, 4, 5 -> 300;
            case 6, 7 -> 450;
            default -> 0;
        };
        System.out.print("Ticket price: " + ticketPrice);
    }
}
