package com.example.estore.model;

public class Product {

    private String name;
    private Integer price;

    // Default Constructor
    public Product() {
    }

    // Parameterized Constructor
    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    // toString Method
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
