package mock_interview.task2;
/* Implement notification  system
Model: Recipient, Message,
sendAll()
"{Notificatiion type} with content: {message} was sent to {Recipient}"
*/

public class Notification {
    private String recipient;
    private String message;

    public Notification(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void send(String recipient, String message) {
        System.out.println("Message is sent");
    }
}
