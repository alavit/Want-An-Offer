package clean_code.practice_1.task_1;

public class MathOperations {
    public int add(int[] args) {
        int sum = 0;
        for (int num : args) {
            sum += num;
        }
        return sum;
    }
}

