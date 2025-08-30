package practice_7.exceptions.task3;

import practice_7.exceptions.exceptions.InvalidUserAge;

public class Main {
    public static void main(String[] args) {
        try {
            Task3.validateUserAge(151);
        }
        catch (InvalidUserAge e) {
            System.err.println(e.getMessage());
        }
    }
}
