package behavioral_patterns.template_method.orders_processing;

public class PremiumOrder extends OrderProcessor {
    @Override
    protected void applyDiscount() {
        System.out.println("Premium discount applied");
    }

    @Override
    protected void calculateShipping() {
        System.out.println("Express shipping calculated");
    }
}