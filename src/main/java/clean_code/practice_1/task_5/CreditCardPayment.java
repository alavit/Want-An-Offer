package clean_code.practice_1.task_5;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата кредитной картой на сумму " + amount);
    }
}
