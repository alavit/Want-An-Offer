package practice_8.part_1;

public class MainForMathOperation {
    public static void main(String[] args) {
        MathOperation add = Integer::sum;
        MathOperation subtract = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;
        MathOperation divide = (a, b) -> {
            if (b != 0) return a / b;
            else throw new ArithmeticException();
        };

        System.out.println(add.apply(1, 2)); // 3
        System.out.println(subtract.apply(5, 1)); // 4
        System.out.println(multiply.apply(2, 4)); // 8
        System.out.println(divide.apply(10, 5)); // 2
    }
}
