package behavioral_patterns.state.orders_management;

public class Delivered implements OrderState {
    @Override
    public void next(Order order) {
        System.out.println("Order has already been delivered!");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("It is not possible to cancel, order already delivered!");
    }
}
