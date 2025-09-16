package practice_11;

public class DebugTask8 {
    public static void main(String[] args) {
        double a = 0.1 * 3;
        double b = 0.3;
        double eps = 1e-9;
        if (Math.abs(a - b) < eps) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}