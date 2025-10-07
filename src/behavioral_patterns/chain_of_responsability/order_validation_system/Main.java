package behavioral_patterns.chain_of_responsability.order_validation_system;

public class Main {
    public static void main(String[] args) {
        ValidStock validStock = new ValidStock();
        ValidPayment validPayment = new ValidPayment();
        ValidAddress validAddress = new ValidAddress();

        // Configurando a cadeia de responsabilidade
        validStock.setNext(validPayment);
        validPayment.setNext(validAddress);

        // Validação dos pedidos
        System.out.println(">>> Order 1:");
        Order order1 = new Order(true, true, true);
        validStock.validate(order1);

        System.out.println("\n>>> Order 2:");
        Order order2 = new Order(true, false, true);
        validStock.validate(order2);

        System.out.println("\n>>> Order 3:");
        Order order3 = new Order(true, true, false);
        validStock.validate(order3);
    }
}
