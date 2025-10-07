package behavioral_patterns.chain_of_responsability.order_validation_system;

public class ValidStock extends BaseOrderValidator {
    @Override
    public void validate(Order order) {
        if (!order.isStockAvailable()) {
            System.out.println("Failure: Product without stock");
            return;
        }
        System.out.println("Successful validated stock");
        nextValidation(order);
    }
}
