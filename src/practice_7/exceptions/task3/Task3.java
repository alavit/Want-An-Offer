package practice_7.exceptions.task3;

import practice_7.exceptions.exceptions.InvalidUserAgeException;

public class Task3 {
    public static void validateUserAge(int userAge) throws InvalidUserAgeException {
        if (userAge < 0 || userAge > 150) {
            throw new InvalidUserAgeException("Age " + userAge + " is invalid");
        }
    }
}
