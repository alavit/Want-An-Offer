package clean_code.practice_1.task_5;

public class BitcoinPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата Bitcoin на сумму " + amount);
    }
}
