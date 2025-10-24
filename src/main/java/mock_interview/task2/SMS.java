package mock_interview.task2;

public class SMS extends Notification {
    public SMS(String recipient, String message) {
        super(recipient, message);
    }

    @Override
    public void send(String recipient, String message) {
        System.out.println("mock_interview.task2.SMS with content: " + message + " was sent to " + recipient);
    }
}