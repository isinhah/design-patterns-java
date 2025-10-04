package structural_patterns.facade.order_products.subsystems;

public class DeliveryService {
    public void deliver(String product, String address) {
        System.out.println("Delivering " + product + " to " + address);
    }
}
