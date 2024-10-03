package com.andyalex.planepargneservice.repository;

import com.andyalex.planepargneservice.entities.PEACustomer;
import org.springframework.data.repository.CrudRepository;

// @RepositoryRestResource ==> This annotation allows to implement a Generic  Web Service
public interface PEACustomerRepository extends CrudRepository<PEACustomer, Long> {

}
