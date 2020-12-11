package com.example.home_work_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/nameProd")
    public String getControllerName()
    {
        return "ProductController";
    }

    @GetMapping("/products/{product_id}")
    public Product getProductById(@PathVariable("product_id") Integer productId)
    {
        return new Product(1, "Milk", 15.0);
    }
}
