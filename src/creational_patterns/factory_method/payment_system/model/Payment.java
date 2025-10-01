package creational_patterns.factory_method.payment_system.model;

public abstract class Payment {

    protected String from;
    protected String to;
    protected double amount;

    public Payment(String from, String to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public abstract void processPayment();
}