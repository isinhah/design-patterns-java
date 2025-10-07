package behavioral_patterns.chain_of_responsability.order_validation_system;

public class ValidPayment extends BaseOrderValidator {

    @Override
    public void validate(Order order) {
        if (!order.isValidPayment()) {
            System.out.println("Failure: Invalid payment");
            return;
        }
        System.out.println("Payment successfully validated");
        nextValidation(order);
    }
}
