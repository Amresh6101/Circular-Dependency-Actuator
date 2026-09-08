package com.example.refactorcd;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("refactored")
public class PaymentService {
    private final OrderStatusService orderStatusService;

    public PaymentService(
            OrderStatusService orderStatusService) {

        this.orderStatusService = orderStatusService;
    }
    public String processPayment(Long orderId){
        System.out.println(
                "PaymentService:"+ " Processing payment for order:"+ orderId
        );
        boolean paymentSuccessFul=true;

        if(!paymentSuccessFul){
            return "Payment failed for order "+ orderId;
        }

        orderStatusService.markOrderAsPaid(orderId);
        return "Payment successful for order "+ orderId;
    }
}
