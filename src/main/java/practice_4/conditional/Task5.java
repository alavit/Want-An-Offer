package main.java.practice_4.conditional;

/*Задача:
        Напишите программу, которая определяет размер скидки:
До 18 лет — 25%
От 65 и старше — 30%
Остальные — без скидки
Методы и конструкции:
Scanner
if, else if, else
        System.out.println(*/

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш возраст: ");
        int age = scanner.nextInt();

        int discount = 0;
        if (age < 18) {
            discount = 25;
        }
        else if (age >=65) {
            discount = 30;
        }
        System.out.println("Ваша скидка: " + discount);
    }
}
