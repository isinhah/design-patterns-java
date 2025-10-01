package creational_patterns.factory_method.payment_system.service;

import creational_patterns.factory_method.payment_system.factory.PaymentFactory;
import creational_patterns.factory_method.payment_system.model.Payment;
import creational_patterns.factory_method.payment_system.model.PaymentType;

public class PaymentService {

    private final PaymentFactory paymentFactory;

    public PaymentService(PaymentFactory paymentFactory) {
        this.paymentFactory = paymentFactory;
    }

    public void sendPayment(PaymentType paymentType, String from, String to, double amount){
        Payment payment = paymentFactory.createPayment(paymentType, from, to, amount);
        payment.processPayment();
    }
}
