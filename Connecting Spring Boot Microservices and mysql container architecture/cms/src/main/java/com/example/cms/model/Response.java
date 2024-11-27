package com.example.cms.model;

import java.util.List;

public class Response {

    private Integer code;
    private String message;
    private List<Customer> customers;

    // Default constructor
    public Response() {
    }

    // Parameterized constructor
    public Response(Integer code, String message, List<Customer> customers) {
        this.code = code;
        this.message = message;
        this.customers = customers;
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

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    // toString method for debugging and logging
    @Override
    public String toString() {
        return "Response{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", customers=" + customers +
                '}';
    }
}
