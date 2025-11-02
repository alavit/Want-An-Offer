package clean_code.practice_1.task_8;

public class NotificationService {
    private Sender sender;

    public NotificationService(Sender sender) {
        this.sender = sender;
    }

    public void sendNotification(String message) {
        sender.send(message);
    }
}
