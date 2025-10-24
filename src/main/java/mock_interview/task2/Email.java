package mock_interview.task2;

public class Email extends Notification {
    public Email(String recipient, String message) {
        super(recipient, message);
    }

    @Override
    public void send(String recipient, String message) {
        System.out.println("mock_interview.task2.Email with content: " + message + " was sent to " + recipient);
    }
}
