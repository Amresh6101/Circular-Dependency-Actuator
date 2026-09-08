package com.example.refactorcd;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("refactored")
// create seprate class for order status
public class OrderStatusService {
    public void markOrderAsPaid(Long orderId) {

        System.out.println(
                "OrderStatusService:"
                        + " Order "
                        + orderId
                        + " marked as PAID"
        );
    }
}
