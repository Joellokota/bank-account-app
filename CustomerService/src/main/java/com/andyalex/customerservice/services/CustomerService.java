package com.andyalex.customerservice.services;

import com.andyalex.customerservice.entities.Customer;
import com.andyalex.customerservice.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer findCustomerById(Long id) {
        return this.customerRepository.findById(id).orElseThrow();
    }

    public Customer createCustomer(String firstName, String lastName) {
        return this.customerRepository.save(Customer.builder()
                        .firstName(firstName)
                        .lastName(lastName)
                .build());
    }

    public Customer createCustomer(Customer customer) {
        return this.customerRepository.save(customer);
    }

    public Customer createCustomer(String firstName, String lastName, String email) {
        return this.customerRepository.save(Customer.builder()
                .firstName(firstName)
                .lastName(lastName)
                        .email(email)
                .build());
    }
    public List<Customer> createAllCustomers(List<Customer> customers) {
        return this.customerRepository.saveAll(customers);
    }

    public List<Customer> getAllCustomers() {
        return this.customerRepository.findAll();
    }
}
