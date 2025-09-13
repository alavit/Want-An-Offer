package main.java.practice_7.exceptions.task3;

import main.java.practice_7.exceptions.exceptions.InvalidUserAgeException;

public class Main {
    public static void main(String[] args) {
        try {
            Task3.validateUserAge(151);
        }
        catch (InvalidUserAgeException e) {
            System.err.println(e.getMessage());
        }
    }
}
