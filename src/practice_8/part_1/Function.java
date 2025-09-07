package practice_8.part_1;

@FunctionalInterface
public interface Function<String, Integer> {
    Integer apply(String str);
}
