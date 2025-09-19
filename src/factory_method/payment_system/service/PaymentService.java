package factory_method.payment_system.service;

import factory_method.payment_system.factory.PaymentFactory;
import factory_method.payment_system.model.Payment;
import factory_method.payment_system.model.PaymentType;

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
