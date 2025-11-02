package clean_code.practice_1.task_4;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.processOrder();

        Invoice invoice = new Invoice();
        invoice.generateInvoice();

        EmailConfirmation emailConfirmation = new EmailConfirmation();
        emailConfirmation.sendEmailConfirmation();
    }
}
