package mock_interview.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MySystem system = new MySystem();
        Email email = new Email("Vasya", "some mnessage");
        SMS sms = new SMS("Petya", "new message");
        Push push = new Push("Igor", "my message");
        List<Notification> list = new ArrayList<>();
        list.add(email);
        list.add(sms);
        list.add(push);
        system.sendAll(list);
    }
}
