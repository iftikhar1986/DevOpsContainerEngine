package com.example.estore.model;

import java.util.List;

public class Response {

    private Integer code;
    private String message;
    private List<Product> products;

    // Default Constructor
    public Response() {
    }

    // Parameterized Constructor
    public Response(Integer code, String message, List<Product> products) {
        this.code = code;
        this.message = message;
        this.products = products;
    }

    // Getters and Setters
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // toString Method
    @Override
    public String toString() {
        return "Response{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", products=" + products +
                '}';
    }
}
