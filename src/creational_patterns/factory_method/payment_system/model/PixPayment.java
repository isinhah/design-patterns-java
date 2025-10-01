package creational_patterns.factory_method.payment_system.model;

public class PixPayment extends Payment{

    public PixPayment(String from, String to, double amount) {
        super(from, to, amount);
    }

    @Override
    public void processPayment() {
        System.out.println("PIX Payment Processing..." + "\nAmount: " + amount + "\nFrom: " + from + "\nTo: " + to);
    }
}