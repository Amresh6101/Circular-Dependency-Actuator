package com.example.circulardependency;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final PaymentService paymentService;
    // constructor injection
    public OrderService( @Lazy PaymentService paymentService) {
        System.out.println("creating OrderService...");
        this.paymentService = paymentService;
    }

    public String placeOrder(Long orderId){
        System.out.println("OrderService: placing order "+ orderId);
        return paymentService.processPayment(orderId);
    }

    public void markOrderAsPaid(Long orderId){
        System.out.println(
                "Orderservice: Order"+ orderId+" marked as Paid"
        );
    }
}
