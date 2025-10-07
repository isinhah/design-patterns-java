package behavioral_patterns.state.orders_management;

public interface OrderState {
    void next(Order order);
    void cancel(Order order);
}