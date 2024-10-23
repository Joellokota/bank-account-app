package com.andyalex.accountbank;

import com.andyalex.accountbank.entities.AccountBank;
import com.andyalex.accountbank.services.AccountBankService;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.UUID;

@SpringBootApplication
@EnableFeignClients
public class AccountBankApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountBankApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AccountBankService accountBankService) {
        return args -> {
            List<AccountBank> listAccounts = List.of(
                    AccountBank.builder()
                            .id(UUID.randomUUID().toString())
                            .bankName("BPCE")
                            .accountType("COMPTE_JOINT")
                            .accountNumber("98767898765")
                            .customerID(Long.valueOf(1))
                            .build(),
                    AccountBank.builder()
                            .id(UUID.randomUUID().toString())
                            .bankName("BOURSORAMA")
                            .accountType("COMPTE_COURANT")
                            .accountNumber("98767898765")
                            .customerID(Long.valueOf(2))
                            .build(),
                    AccountBank.builder()
                            .id(UUID.randomUUID().toString())
                            .bankName("BPCE")
                            .accountType("LIVRET_A")
                            .accountNumber("98767898765")
                            .customerID(Long.valueOf(3))
                            .build(),
                    AccountBank.builder()
                            .id(UUID.randomUUID().toString())
                            .bankName("CA")
                            .accountType("COMPTE_JOINT")
                            .accountNumber("98767898765")
                            .customerID(Long.valueOf(2))
                            .build(),
                    AccountBank.builder()
                            .id(UUID.randomUUID().toString())
                            .bankName("BNP")
                            .accountType("COMPTE_JOINT")
                            .accountNumber("98767898765")
                            .customerID(Long.valueOf(1))
                            .build()
                    );
            accountBankService.saveAccountBankAll(listAccounts);
        };
    }
}
