package behavioral_patterns.strategy.freight_calculator;

public class ExpressShipping implements ShippingStrategy {
    @Override
    public double calculate(double weight) {
        return weight * 2.0;
    }
}
