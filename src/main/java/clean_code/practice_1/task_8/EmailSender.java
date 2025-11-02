package clean_code.practice_1.task_8;

class EmailSender implements Sender {
    public void send(String message) {
        System.out.println("Отправка email: " + message);
    }
}
