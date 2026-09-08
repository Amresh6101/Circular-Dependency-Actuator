package com.example.refactorcd;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("refactored")
public class OrderService {
    private final PaymentService paymentService;

    public OrderService(
            PaymentService paymentService) {

        this.paymentService = paymentService;
    }
    public String placeOrder(Long orderId){
        System.out.println(
        "orderService:" + " placing order "+ orderId);
        return paymentService.processPayment(orderId);
    }
}
