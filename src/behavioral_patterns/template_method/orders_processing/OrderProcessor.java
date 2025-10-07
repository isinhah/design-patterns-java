package behavioral_patterns.template_method.orders_processing;

public abstract class OrderProcessor {

    // Template method
    public void processOrder() {
        validateCart();
        applyDiscount(); // variável
        calculateShipping(); // variável
        processPayment();
        sendConfirmation();
    }

    protected void validateCart() {
        System.out.println("Validated cart");
    }

    protected abstract void applyDiscount();
    protected abstract void calculateShipping();

    protected void processPayment() {
        System.out.println("Processed payment");
    }

    protected void sendConfirmation() {
        System.out.println("Confirmation submitted");
    }
}
