package mock_interview.task2;

import java.util.List;

public class MySystem {
    public void sendAll(List<Notification> list) {
        for (Notification notification : list) {
            notification.send(notification.getRecipient(), notification.getMessage());
        }
    }
}
