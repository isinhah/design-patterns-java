package behavioral_patterns.template_method.orders_processing;

public class Main {
    public static void main(String[] args) {
        System.out.println("Order processing started");

        System.out.println();

        System.out.println("--- STANDARD ORDER ---");
        OrderProcessor standardOrder1 = new StandardOrder();
        standardOrder1.processOrder();

        System.out.println();

        System.out.println("--- PREMIUM ORDER ---");
        OrderProcessor premiumOrder1 = new PremiumOrder();
        premiumOrder1.processOrder();
    }
}
