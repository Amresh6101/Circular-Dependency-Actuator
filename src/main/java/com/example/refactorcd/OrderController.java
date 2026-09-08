package com.example.refactorcd;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
@Profile("refactored")
public class OrderController {
//    private final OrderService orderService;
    @Autowired
    private OrderService orderService;
    // when we use @Autowired we called is field injection
    // constructor injection
//    public OrderController(OrderService orderService) {
//        this.orderService = orderService;
//    }
    @PostMapping("/{orderId}/pay")
    public String payOrder(
            @PathVariable Long orderId) {

        return orderService.placeOrder(orderId);
    }
}

