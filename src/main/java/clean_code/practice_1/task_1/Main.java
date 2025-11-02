package clean_code.practice_1.task_1;

public class Main {
    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        int result = mathOperations.add(new int[]{1, 2, 3, 4, 5});
        System.out.println("The sum is: " + result);
    }
}
