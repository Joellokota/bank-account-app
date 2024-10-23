package com.andyalex.accountbank.entities;

import com.andyalex.accountbank.models.Customer;
import jakarta.persistence.*;
import lombok.*;

@Getter @Setter @AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class AccountBank {

    @Id
    private String id;
    private String accountNumber;
    private String bankName;
    private String accountType;
    private double balance;
    private double creditLimit;
    private double debitLimit;
    private String currency;
    private Long customerID;
    @Transient
    private Customer customer;
}