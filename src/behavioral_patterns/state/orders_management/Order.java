package behavioral_patterns.state.orders_management;

public class Order {
    private OrderState state;

    public Order() {
        state = new Pending();
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void nextState() {
        state.next(this);
    }

    public void cancel() {
        state.cancel(this);
    }
}
