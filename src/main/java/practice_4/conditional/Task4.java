package practice_4.conditional;

/*Задача:
        Напишите программу, которая проверяет, является ли введённое число чётным или нечётным.
Методы и конструкции:
Scanner
if-else, оператор %
        System.out.println()*/

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Число четное");
        }
        else {
            System.out.println("Число нечетное");
        }
    }
}
