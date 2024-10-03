package com.andyalex.planepargneservice.service;

import com.andyalex.planepargneservice.entities.PEACustomer;
import com.andyalex.planepargneservice.repository.PEACustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PEACustomerService {

    private final PEACustomerRepository peaCustomerRepos;

    public PEACustomerService(PEACustomerRepository peacustomerRepository) {
        this.peaCustomerRepos = peacustomerRepository;
    }

    public List<PEACustomer> listPEACustomers() {
        return (List<PEACustomer>) this.peaCustomerRepos.findAll();
    }

    public PEACustomer findPeaCustomerByID(Long id) {
        return this.peaCustomerRepos.findById(id).get();
    }

    public List<PEACustomer> saveALl(List<PEACustomer> peaCustomers) {
        return (List<PEACustomer>) this.peaCustomerRepos.saveAll(peaCustomers);
    }
}
