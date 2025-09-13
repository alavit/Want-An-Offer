package main.java.practice_9.task_1;

public class ThreadHello implements Runnable {
    @Override
    public void run() {
        for(int i=1;i<6;i++) {
            System.out.println("Привет из потока!");
            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
