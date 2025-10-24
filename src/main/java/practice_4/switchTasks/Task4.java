package practice_4.switchTasks;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a command: ");
        String command = scanner.nextLine();

        switch (command) {
            case "start":
                System.out.print("System is started");
                break;
            case "stop":
                System.out.print("System is stopped");
                break;
            case "restart":
                System.out.print("System is restarted");
                break;
            case "status":
                System.out.print("System status");
                break;
            default:
                System.out.print("Invalid command");
                break;
        }
    }
}
