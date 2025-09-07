package practice_8.part_1;

public class AnonymousClass {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };

        r1.run();
    }
}
