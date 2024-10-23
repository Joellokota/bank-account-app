package com.andyalex.accountbank.clients;

import com.andyalex.accountbank.models.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "CUSTOMER-SERVICE")
public interface CustomerRestClient {

    @GetMapping("/list-customers/{customerId}")
    Customer getCustomer(@PathVariable Long customerId);
    @GetMapping("/list-customers")
    List<Customer> getAllCustomers();
}