package practice_7.exceptions.exceptions;

public class InvalidEmailAddressException extends RuntimeException {
    public InvalidEmailAddressException(String message) {
        super(message);
    }
}
