package clean_code.practice_1.task_5;

public class PaymentProcessor {
    public void processPayment(Payment payment, double amount) {
        payment.pay(amount);
    }
}
