package behavioral_patterns.state.orders_management;

public class Shipped implements OrderState {
    @Override
    public void next(Order order) {
        order.setState(new Delivered());
        System.out.println("Order delivered!");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("It is not possible to cancel, order already sent!");
    }
}