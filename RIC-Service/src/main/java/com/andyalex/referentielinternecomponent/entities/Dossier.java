package com.andyalex.referentielinternecomponent.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter @Setter @Builder @AllArgsConstructor
@NoArgsConstructor
@Entity @Table(name = "tbl_dossier")
public class Dossier {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String fileName;
    private String filePath;
    private String fileType;
    private String fileSize;
    private LocalDate fileDate;

}
