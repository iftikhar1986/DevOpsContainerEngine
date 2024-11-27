package com.example.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.cms.model.Customer;
import com.example.cms.model.Response;
import com.example.cms.repository.CustomerRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    private CustomerRepository repository;

    // Endpoint to add a customer
    @GetMapping("/add")
    public Response addCustomer(@RequestParam String name, @RequestParam String phone, @RequestParam String email) {
        // Create a new Customer object
        Customer customer = new Customer();
//        customer.setName(name);
//        customer.setPhone(phone);
//        customer.setEmail(email);

        // Save the customer to the database
        repository.save(customer);

        // Create a Response object
        Response response = new Response(101,name + " added successfully on " + new Date(),null);
//        response.setCode(101); // Assuming 101 indicates success
//        response.setMessage(name + " added successfully on " + new Date());
//        response.setCustomers(null); // No customer list needed here

        return response;
    }
    
    
    // Endpoint to add a customer
    @GetMapping("/list")
    public Response listCustomer() {
       
    	List<Customer> customerList = new ArrayList<Customer>();
        // Save the customer to the database
        repository.findAll().forEach((customer)-> customerList.add(customer));

        // Create a Response object
        Response response = new Response(101," A Total of "+ customerList.size()+" customers feteched at " + new Date(),customerList);
//        response.setCode(101); // Assuming 101 indicates success
//        response.setMessage(name + " added successfully on " + new Date());
//        response.setCustomers(null); // No customer list needed here

        return response;
    }
}
 