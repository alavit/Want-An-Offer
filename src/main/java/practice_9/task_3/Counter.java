package practice_9.task_3;

public class Counter implements Runnable {
    private int counter = 0;
    private volatile boolean stop = false;

    public int getCounter() {
        return counter;
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
        System.out.println("Stop = " + this.isStop());
    }

    @Override
    public void run() {
        while (!stop) {
            counter++;
            System.out.println("Counter: " + this.getCounter());
        }
    }
}
