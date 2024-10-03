package com.andyalex.planepargneservice.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter @Builder @AllArgsConstructor
@NoArgsConstructor
@Entity @Table(name = "tbl_pea")
public class PEACustomer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String amount;
    private String currency;
    private String type;
}
