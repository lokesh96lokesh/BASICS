package com.techsphere.controller;

import com.techsphere.model.Product;
import com.techsphere.model.Order;
import com.techsphere.service.EcommerceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/ecommerce")
public class EcommerceController {

    @Autowired
    private EcommerceService ecommerceService;

    @GetMapping("/products")
    public String getProducts(Model model) {
        List<Product> products = ecommerceService.getAllProducts();
        model.addAttribute("products", products);
        return "ecommerce/products";
    }

    @PostMapping("/product")
    public String addProduct(@ModelAttribute Product product) {
        ecommerceService.addProduct(product);
        return "redirect:/ecommerce/products";
    }

    @PostMapping("/order")
    public String placeOrder(@ModelAttribute Order order) {
        ecommerceService.placeOrder(order);
        return "redirect:/ecommerce/orders";
    }

    @GetMapping("/orders")
    public String getOrders(Model model) {
        model.addAttribute("orders", ecommerceService.getAllOrders());
        return "ecommerce/orders";
    }
}
