package clean_code.practice_1.task_2;

public class Main {
    public static void main(String[] args) {
        DiscountCalculator discountCalculator = new DiscountCalculator();
        System.out.println(discountCalculator.calculateDiscount(100, true, true, false)); // 90
        System.out.println(discountCalculator.calculateDiscount(100, true, false, false)); // 95
        System.out.println(discountCalculator.calculateDiscount(100, false, false, true)); // 93
        System.out.println(discountCalculator.calculateDiscount(100, false, false, false)); // 98

    }
}
