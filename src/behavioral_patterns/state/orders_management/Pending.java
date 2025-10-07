package behavioral_patterns.state.orders_management;

public class Pending implements OrderState {
    @Override
    public void next(Order order) {
        order.setState(new Shipped());
        System.out.println("Order sent!");
    }

    @Override
    public void cancel(Order order) {
        order.setState(new Cancelled());
        System.out.println("Canceled order!");
    }
}
