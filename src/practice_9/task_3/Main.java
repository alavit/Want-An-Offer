package practice_9.task_3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread thread = new Thread(counter);
        thread.start();
        Thread.sleep(2_000);
        counter.setStop(true);
        thread.join();
    }
}
