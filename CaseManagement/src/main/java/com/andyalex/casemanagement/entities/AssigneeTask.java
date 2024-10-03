package com.andyalex.casemanagement.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter @Setter @ToString @Builder @AllArgsConstructor
@NoArgsConstructor
public class AssigneeTask {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long taskId;
    private String assignee;
    private String assigneeEmail;
    private String assigneeName;
    private String assigneePhone;
    private String assigneeAddress;
    private String assigneeCity;
    private String assigneeState;
    private String assigneeZip;
    private String assigneeCountry;
    private String assigneePhoneCountry;
    private String assigneeEmailCountry;
    private String assigneeEmailAddress;
    private String assigneeEmailCity;
    private String assigneeEmailState;
    private String assigneeEmailZip;
}
