package main.java.practice_8.part_1;

@FunctionalInterface
public interface Predicate<Integer> {
    boolean check(Integer number);

    default void printIfEven(Integer number) {
        if (check(number)) {
            System.out.println(number + " is even");
        }
    }
}
