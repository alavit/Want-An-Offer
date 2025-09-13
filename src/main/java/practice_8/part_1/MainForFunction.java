package main.java.practice_8.part_1;

public class MainForFunction {
    public static void main(String[] args) {
        Function func = str -> str.toString().length();

        System.out.println(func.apply("abc"));
    }
}
