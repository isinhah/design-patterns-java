package behavioral_patterns.state.orders_management;

public class Cancelled implements OrderState {
    @Override
    public void next(Order order) {
        System.out.println("Order canceled, you cannot proceed!");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Order is already canceled");
    }
}