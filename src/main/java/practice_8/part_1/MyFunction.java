package practice_8.part_1;

@FunctionalInterface
public interface MyFunction<String, Integer> {
    Integer apply(String str);
}
