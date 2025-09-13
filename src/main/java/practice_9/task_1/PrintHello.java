package main.java.practice_9.task_1;

public class PrintHello {
    public static void main(String[] args) throws InterruptedException {
        ThreadHello threadHello = new ThreadHello();
        Thread thread = new Thread(threadHello);
        thread.start();
        thread.join();
    }
}
