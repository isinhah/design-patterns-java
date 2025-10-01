package creational_patterns.factory_method.payment_system.model;

public class DebitCardPayment extends Payment{

    public DebitCardPayment(String from, String to, double amount) {
        super(from, to, amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Debit Card Payment Processing... Amount: " + amount + "\nFrom: " + from + "\nTo: " + to);
    }
}
