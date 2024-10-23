package com.andyalex.customerservice.repository;

import com.andyalex.customerservice.entities.Customer;
import org.hibernate.sql.ast.tree.expression.JdbcParameter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByEmail(String email);
    List<Customer> findByLastName(String lastName);
    List<Customer> findByFirstName(String firstName);
    List<Customer> findByLastNameAndFirstName(String lastName, String firstName);
    List<Customer> findByEmailAndLastName(String email, String lastName);
    List<Customer> findByFirstNameAndLastName(String firstName, String lastName);
    List<Customer> findByEmailAndFirstNameAndLastName(String email, String firstName, String lastName);
    List<Customer> findByFirstNameAndLastNameAndEmail(String firstName, String lastName, String email);
}
