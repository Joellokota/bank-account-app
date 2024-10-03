package com.andyalex.accountbank;

import com.andyalex.accountbank.entities.AccountBank;
import com.andyalex.accountbank.services.AccountBankService;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class AccountBankApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountBankApplication.class, args);
    }

    CommandLineRunner commandLineRunner(AccountBankService accountBankService) {
        return args -> {
            List<AccountBank> listAccounts = List.of(
                    AccountBank.builder()
                            .bankName("BPCE")
                            .accountType("COMPTE_JOINT")
                            .accountNumber("98767898765")
                            .build(),
                    AccountBank.builder()
                            .bankName("BOURSORAMA")
                            .accountType("COMPTE_COURANT")
                            .accountNumber("98767898765")
                            .build(),
                    AccountBank.builder()
                            .bankName("BPCE")
                            .accountType("LIVRET_A")
                            .accountNumber("98767898765")
                            .build(),
                    AccountBank.builder()
                            .bankName("CA")
                            .accountType("COMPTE_JOINT")
                            .accountNumber("98767898765")
                            .build(),
                    AccountBank.builder()
                            .bankName("BNP")
                            .accountType("COMPTE_JOINT")
                            .accountNumber("98767898765")
                            .build()
                    );
            accountBankService.saveAccountBankAll(listAccounts);
        };
    }
}
