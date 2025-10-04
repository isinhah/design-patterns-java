package structural_patterns.facade.order_products.subsystems;

public class PaymentService {
    public void pay(String customer, double amount) {
        System.out.println("Charging " + customer + " R$" + amount);

    }
}
