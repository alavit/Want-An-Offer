package practice_9.task_4;

public class Counter {
    private int counter = 0;

    public synchronized int getCounter() {
        return this.counter;
    }

    public synchronized void increment() {
        this.counter++;
    }
}
