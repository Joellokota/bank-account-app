package com.andyalex.planepargneservice;

import com.andyalex.planepargneservice.entities.PEACustomer;
import com.andyalex.planepargneservice.service.PEACustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class PlanEpargneServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlanEpargneServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(PEACustomerService peacustomerService) {
		return args -> {
			peacustomerService.saveALl(
					List.of(
							PEACustomer.builder()
									.name("PEA 1")
									.amount("200,00")
									.type("PEA TYPE 1")
									.currency("EURO")
									.description("lorem ipsum")
									.build(),
							PEACustomer.builder()
									.name("PEA 2")
									.amount("100,00")
									.type("PEA TYPE 2")
									.currency("EURO")
									.description("lorem ipsum ipsum lorem ipsum ... ")
									.build(),
							PEACustomer.builder()
									.name("PEA 3")
									.amount("500,00")
									.type("PEA TYPE 3")
									.currency("EURO")
									.description("lorem ipsum ipsum..")
									.build(),
							PEACustomer.builder()
									.name("PEA 4")
									.amount("300,00")
									.type("PEA TYPE 4")
									.currency("EURO")
									.description("lorem ipsum ipsum lorem ipsum")
									.build()
							)
			);
		};
	}
}
