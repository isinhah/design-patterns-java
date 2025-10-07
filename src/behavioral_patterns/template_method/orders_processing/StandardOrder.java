package behavioral_patterns.template_method.orders_processing;

public class StandardOrder extends OrderProcessor {
    @Override
    protected void applyDiscount() {
        System.out.println("Default discount applied");
    }

    @Override
    protected void calculateShipping() {
        System.out.println("Standard shipping calculated");
    }
}
