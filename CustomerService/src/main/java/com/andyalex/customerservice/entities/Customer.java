package com.andyalex.customerservice.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @Builder @AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String country;
    private String phoneNumber;
    private String password;
    private String confirmPassword;
}
