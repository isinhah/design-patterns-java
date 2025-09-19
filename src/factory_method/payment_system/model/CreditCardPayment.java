package factory_method.payment_system.model;

public class CreditCardPayment extends Payment{

    public CreditCardPayment(String from, String to, double amount) {
        super(from, to, amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Credit Card Payment Processing... Amount: " + amount + "\nFrom: " + from + "\nTo: " + to);
    }
}
