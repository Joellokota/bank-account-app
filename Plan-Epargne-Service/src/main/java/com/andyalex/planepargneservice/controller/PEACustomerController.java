package com.andyalex.planepargneservice.controller;

import com.andyalex.planepargneservice.entities.PEACustomer;
import com.andyalex.planepargneservice.service.PEACustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class PEACustomerController {

    private final PEACustomerService customerService;

    public PEACustomerController(final PEACustomerService peacustomerService) {
        this.customerService = peacustomerService;
    }

    @GetMapping("/list-all-pea")
    public List<PEACustomer> getAllCustomers() {
        return this.customerService.listPEACustomers();
    }

    @GetMapping("/list-all-pea/{id}")
    PEACustomer getCustomerById(@PathVariable final Long id) {
        return this.customerService.findPeaCustomerByID(id);
    }
}
