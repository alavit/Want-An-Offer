package clean_code.practice_1.task_5;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment(new BitcoinPayment(), 100);
        paymentProcessor.processPayment(new CreditCardPayment(), 200);
        paymentProcessor.processPayment(new PayPalPayment(), 300);
    }
}
