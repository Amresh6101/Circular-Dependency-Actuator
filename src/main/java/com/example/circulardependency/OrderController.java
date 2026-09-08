package com.example.circulardependency;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/circular-dependency")
public class OrderController {

    private final OrderService orderService;
    // constructor injection
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/{orderId}/pay")
    public String payOrder(@PathVariable Long orderId){
        return orderService.placeOrder(orderId);
    }
}
