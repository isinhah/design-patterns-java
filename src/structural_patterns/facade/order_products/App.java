package structural_patterns.facade.order_products;

public class App {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();

        orderFacade.placeOrder("phone", "isabel", 2.50, "recife");
    }
}
