package structural_patterns.facade.order_products;

import structural_patterns.facade.order_products.subsystems.DeliveryService;
import structural_patterns.facade.order_products.subsystems.InventoryService;
import structural_patterns.facade.order_products.subsystems.PaymentService;

public class OrderFacade {
    private InventoryService inventory;
    private PaymentService payment;
    private DeliveryService delivery;

    public OrderFacade() {
        this.inventory = new InventoryService();
        this.payment = new PaymentService();
        this.delivery = new DeliveryService();
    }

    public void placeOrder(String product, String customer, double amount, String address) {
        if (!inventory.checkStock(product)) {
            System.out.println("Product out of stock");
            return;
        }

        payment.pay(customer, amount);
        delivery.deliver(product, address);

        System.out.println("Order placed successfully");
    }
}
