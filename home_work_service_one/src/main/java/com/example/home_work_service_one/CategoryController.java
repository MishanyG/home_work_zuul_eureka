package com.example.home_work_service_one;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CategoryController {
    @GetMapping("/nameCat")
    public String getControllerName()
    {
        return "CategoryController";
    }

    @GetMapping("/category/{category_id}/products")
    public List<Product> getProductsByCategory(@PathVariable("category_id") Integer categoryId)
    {
        List<Product> productList = new ArrayList <>();

        productList.add(new Product(1, "Bread", 25.0));
        productList.add(new Product(2, "Cheese", 56.0));
        return productList;
    }
}
