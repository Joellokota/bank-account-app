package com.andyalex.referentielinternecomponent.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_demande")
public class Demande {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String description;
    private String type;
    private LocalDate startDate;
    private LocalDate endDate;
    private String name;
}
