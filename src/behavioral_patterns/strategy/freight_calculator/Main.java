package behavioral_patterns.strategy.freight_calculator;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(new StandardShipping());
        System.out.println("Standard shipping: " + order.calculateShipping(10));

        order.setStrategy(new ExpressShipping());
        System.out.println("Express shipping: " + order.calculateShipping(10));
    }
}