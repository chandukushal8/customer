
package com.example.customer.controller;
import com.example.customer.model.Customer;
import com.example.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    @Autowired
    private CustomerService service;
    @GetMapping("/ping")
    public String ping() {
        return "hey Chandu, make sure you learn it right";
    }
    @GetMapping
    public List<Customer> getAllCustomers() {
        return service.getAll();
    }
}
