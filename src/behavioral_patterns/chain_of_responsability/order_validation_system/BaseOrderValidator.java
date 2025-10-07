package behavioral_patterns.chain_of_responsability.order_validation_system;

// Implementação do cadeamento básico
public abstract class BaseOrderValidator implements OrderValidator {
    protected OrderValidator nextOrderValidator;

    @Override
    public void setNext(OrderValidator nextOrderValidator) {
        this.nextOrderValidator = nextOrderValidator;
    }

    protected void nextValidation(Order order) {
        if (nextOrderValidator != null) {
            nextOrderValidator.validate(order);
        } else {
            System.out.println("Approved order! All validations passed.");
        }
    }
}
