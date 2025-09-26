package practice_8.part_1;

@FunctionalInterface
public interface MyPredicate<Integer> {
    boolean isEven(Integer number);

    default void printIfEven(Integer number) {
        if (isEven(number)) {
            System.out.println(number + " is even");
        }
    }
}
