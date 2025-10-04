package structural_patterns.facade.order_products.subsystems;

public class InventoryService {

    public boolean checkStock(String product) {
        System.out.println("Checking stock for " + product);
        return true;
    }
}
