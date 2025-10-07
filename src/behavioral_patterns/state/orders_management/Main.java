package behavioral_patterns.state.orders_management;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        order.nextState();
        order.nextState();
        order.cancel();
    }
}
