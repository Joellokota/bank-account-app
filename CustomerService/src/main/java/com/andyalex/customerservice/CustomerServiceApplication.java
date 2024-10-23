package com.andyalex.customerservice;

import com.andyalex.customerservice.entities.Customer;
import com.andyalex.customerservice.services.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadDataInBase(CustomerService customerService) {
        return args -> {
            customerService.createAllCustomers(
                    List.of(
                    Customer.builder()
                            .firstName("John")
                            .lastName("Doe")
                            .email("john.doe@gmail.com")
                            .address("27 Rue de Paris")
                            .phone("06 98 76 71 87")
                            .city("Paris")
                            .country("France")
                            .build(),
                    Customer.builder()
                            .firstName("Patrick")
                            .lastName("Carl")
                            .email("patrick.carl@gmail.com")
                            .address("27 Rue de Washington")
                            .phone("06 98 76 71 87")
                            .city("Washington")
                            .country("USA")
                            .build(),
                    Customer.builder()
                            .firstName("James")
                            .lastName("Bond")
                            .email("james.bond@gmail.com")
                            .address("27 Rue de London")
                            .phone("06 98 76 71 87")
                            .city("London")
                            .country("Great Britain")
                            .build()
                    ));
        };
    }
}
