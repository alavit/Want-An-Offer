package main.java.practice_9.task_2;

public class PrintMessage {
    public static void main(String[] args) throws InterruptedException {
        ThreadPrint threadPrint1 = new ThreadPrint("A");
        ThreadPrint threadPrint2 = new ThreadPrint("B");
        Thread thread1 = new Thread(threadPrint1);
        Thread thread2 = new Thread(threadPrint2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
