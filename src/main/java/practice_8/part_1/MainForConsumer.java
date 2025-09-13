package main.java.practice_8.part_1;

public class MainForConsumer {
    public static void main(String[] args) {
        Consumer<String> consumer = str -> System.out.println(str);

        consumer.apply("foo bar");
    }
}
