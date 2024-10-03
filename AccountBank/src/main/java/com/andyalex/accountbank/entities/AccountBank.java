package com.andyalex.accountbank.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter @AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class AccountBank {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String accountNumber;
    private String bankName;
    private String accountType;
}