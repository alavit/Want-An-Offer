package main.java.practice_7.exceptions.task4;

import main.java.practice_7.exceptions.exceptions.InvalidEmailAddressException;
import java.util.regex.Pattern;

public class Task4 {
    public static void validateEmailAddress(String emailAddress) {
        if (emailAddress == null || emailAddress.isEmpty()) {
            throw new InvalidEmailAddressException("Email address cannot be null or empty");
        }
        if (Pattern.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", emailAddress)) {
            System.out.println("Valid email address: " + emailAddress);
        } else {
            throw new InvalidEmailAddressException("Invalid email address format: " + emailAddress);
        }
    }
}
