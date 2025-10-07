package behavioral_patterns.strategy.freight_calculator;

public class StandardShipping implements ShippingStrategy {
    @Override
    public double calculate(double weight) {
        return weight;
    }
}