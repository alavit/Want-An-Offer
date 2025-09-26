package practice_8.part_1;

public class MainForChecker {
    public static void main(String[] args) {
        MyPredicate isEven = n -> ((int) n) % 2 == 0;

        isEven.printIfEven(10);
        isEven.printIfEven(3);
    }
}
