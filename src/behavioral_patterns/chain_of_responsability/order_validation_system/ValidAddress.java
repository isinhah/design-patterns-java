package behavioral_patterns.chain_of_responsability.order_validation_system;

public class ValidAddress extends BaseOrderValidator {

    @Override
    public void validate(Order order) {
        if (!order.isValidAddress()) {
            System.out.println("Failure: Invalid address");
            return;
        }
        System.out.println("Address successfully validated");
        nextValidation(order);
    }
}
