package practice_3;

public class MathConstants {
    static final double PI = 3.14159;
    final double E = 2.71828;

    static double calculateCircleArea(double r) {
        return PI * r * r;
    }

    static double calculateCircumference(double r) {
        return 2 * PI * r;
    }
}
