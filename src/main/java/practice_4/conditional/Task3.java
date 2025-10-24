package practice_4.conditional;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число от 1 до 5: ");
        int number = scanner.nextInt();

        String mark = "нет оценки";
        switch (number) {
            case 1:
                mark = "Неудовлетворительно";
                break;
            case 2:
                mark = "Неудовлетворительно";
                break;
            case 3:
                mark = "Удовлетворительно";
                break;
            case 4:
                mark = "Хорошо";
                break;
            case 5:
                mark = "Отлично";
                break;
        }
        System.out.println("Оценка: " + mark);
    }
}
