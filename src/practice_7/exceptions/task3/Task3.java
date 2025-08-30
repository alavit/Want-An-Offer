package practice_7.exceptions.task3;

import practice_7.exceptions.exceptions.InvalidUserAge;

public class Task3 {
    public static void validateUserAge(int userAge) throws InvalidUserAge {
        if (userAge < 0 || userAge > 150) {
            throw new InvalidUserAge(userAge + " is invalid age");
        }
    }
}
