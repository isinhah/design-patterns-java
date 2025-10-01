package creational_patterns.factory_method.payment_system.factory;

import creational_patterns.factory_method.payment_system.model.*;

public class PaymentFactory {
    public Payment createPayment(PaymentType type, String from, String to, double amount){
        return switch (type) {
            case CREDIT_CARD -> new CreditCardPayment(from, to, amount);
            case PIX ->  new PixPayment(from, to, amount);
            case DEBIT_CARD ->  new DebitCardPayment(from, to, amount);
        };
    }
}
