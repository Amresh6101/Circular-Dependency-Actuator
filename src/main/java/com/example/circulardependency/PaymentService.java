package com.example.circulardependency;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("circular-dependency")
public class PaymentService {
    private final OrderService orderService;
    // constructor injection
    public PaymentService(OrderService orderService) {
        System.out.println("Creating PaymentService...");
        this.orderService = orderService;
    }

    public String processPayment(Long orderId){
        System.out.println(
                "PaymentService: processing payment for order " + orderId
        );
        // this is the main reason from causing circular dependency
        orderService.markOrderAsPaid(orderId);
        return "Payment successful for order " + orderId;
    }
}
