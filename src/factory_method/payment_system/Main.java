package factory_method.payment_system;

import factory_method.payment_system.factory.PaymentFactory;
import factory_method.payment_system.model.PaymentType;
import factory_method.payment_system.service.PaymentService;

public class Main {
    public static void main(String[] args) {
        PaymentFactory paymentFactory = new PaymentFactory();
        PaymentService paymentService = new PaymentService(paymentFactory);

        paymentService.sendPayment(PaymentType.PIX, "isabel", "maria", 10.00);
        paymentService.sendPayment(PaymentType.CREDIT_CARD, "maria", "joão", 10.00);
    }
}
