package behavioral_patterns.chain_of_responsability.order_validation_system;

public class Order {
    private boolean stockAvailable;
    private boolean validPayment;
    private boolean validAddress;

    public Order(boolean stockAvailable, boolean validPayment, boolean validAddress) {
        this.stockAvailable = stockAvailable;
        this.validPayment = validPayment;
        this.validAddress = validAddress;
    }

    public boolean isStockAvailable() {
        return stockAvailable;
    }

    public boolean isValidPayment() {
        return validPayment;
    }

    public boolean isValidAddress() {
        return validAddress;
    }
}
