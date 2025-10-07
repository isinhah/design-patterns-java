package behavioral_patterns.strategy.freight_calculator;

public class Order {
    private ShippingStrategy strategy;

    public Order(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateShipping(double weight) {
        return strategy.calculate(weight);
    }
}
