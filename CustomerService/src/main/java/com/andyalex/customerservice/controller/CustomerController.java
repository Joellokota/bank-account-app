package com.andyalex.customerservice.controller;

import com.andyalex.customerservice.entities.Customer;
import com.andyalex.customerservice.services.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("list-customers")
    public List<Customer> getCustomers() {
        return this.customerService.getAllCustomers();
    }

    @GetMapping("list-customers/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return this.customerService.findCustomerById(id);
    }
}
