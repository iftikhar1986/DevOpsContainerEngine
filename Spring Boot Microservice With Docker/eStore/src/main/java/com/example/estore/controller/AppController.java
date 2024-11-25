package com.example.estore.controller;

import com.example.estore.model.Product;
import com.example.estore.model.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/app")
public class AppController {

    @GetMapping(path="/wellcome")
    public String wellcome() {
        return "<h3>Welcome to eStore</h3>";
    }

    @GetMapping(path="/products")
    public Response getProducts() {
        // Create some sample products
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Laptop", 1500));
        productList.add(new Product("Smartphone", 800));
        productList.add(new Product("Tablet", 500));

        // Create and return the response
        Response response = new Response(101, "Products fetched successfully", productList);
        
        return response;
    }
}
