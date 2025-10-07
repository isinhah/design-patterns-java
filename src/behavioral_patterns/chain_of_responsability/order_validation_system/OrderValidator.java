package behavioral_patterns.chain_of_responsability.order_validation_system;

public interface OrderValidator {
    void setNext(OrderValidator nextOrderValidator);
    void validate(Order order);
}