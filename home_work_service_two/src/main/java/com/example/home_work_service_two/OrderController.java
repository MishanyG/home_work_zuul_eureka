package com.example.home_work_service_two;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class OrderController {
    @GetMapping("/nameOrd")
    public String getControllerName()
    {
        return "OrderController";
    }

    @GetMapping("/orders/{order_id}/category/{category_id}/products")
    public List<Product> getProductsByOrderCourses(
            @PathVariable("order_id") Integer orderId,
            @PathVariable("category_id") Integer categoryId) {
        List<Product> productList = new ArrayList <>();

        productList.add(new Product(1, "Milk", 42.5));
        productList.add(new Product(2, "Bread", 47.8));
        productList.add(new Product(3, "Cheese", 58.7));
        return productList;
    }
}
