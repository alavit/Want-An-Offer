package practice_7.exceptions.exceptions;

public class InvalidEmailAddress extends RuntimeException {
    public InvalidEmailAddress(String message) {
        super(message);
    }
}
