package com.andyalex.accountbank.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder @Getter
@Setter
public class Customer {

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
