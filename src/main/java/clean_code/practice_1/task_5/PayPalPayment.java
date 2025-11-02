package clean_code.practice_1.task_5;

public class PayPalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата через PayPal на сумму " + amount);
    }
}
