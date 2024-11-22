package com.techsphere.controller;

import com.techsphere.model.Product;
import com.techsphere.model.Order;
import com.techsphere.service.EcommerceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ecommerce")
public class EcommerceRestController {

    @Autowired
    private EcommerceService ecommerceService;

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return ecommerceService.getAllProducts();
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        return ecommerceService.addProduct(product);
    }

    @PostMapping("/orders")
    public Order placeOrder(@RequestBody Order order) {
        return ecommerceService.placeOrder(order);
    }
}
