package main.java.practice_9.task_2;

public class ThreadPrint implements Runnable {
    private final String message;

    public ThreadPrint(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println(this.message);
            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
