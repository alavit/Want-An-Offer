package mock_interview.task2;

public class Push extends Notification {
    public Push(String recipient, String message) {
        super(recipient, message);
    }

    @Override
    public void send(String recipient, String message) {
        System.out.println("mock_interview.task2.Push with content: " + message + " was sent to " + recipient);
    }
}