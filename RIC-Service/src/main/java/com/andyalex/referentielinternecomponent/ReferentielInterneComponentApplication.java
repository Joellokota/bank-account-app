package com.andyalex.referentielinternecomponent;

import com.andyalex.referentielinternecomponent.entities.Demande;
import com.andyalex.referentielinternecomponent.entities.Dossier;
import com.andyalex.referentielinternecomponent.services.DemandeService;
import com.andyalex.referentielinternecomponent.services.DossierService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class ReferentielInterneComponentApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReferentielInterneComponentApplication.class, args);
    }

    @Bean
    CommandLineRunner loadDataInDatabase(DemandeService demandeService, DossierService dossierService) {

        return args -> {
            demandeService.saveAll(List.of(
                    Demande.builder()
                            .name("Foreign documentation creation")
                            .type("Foreign documentation creation")
                            .description("Foreign documentation creation")
                            .startDate(LocalDate.of(2024, 3, 21))
                            .endDate(LocalDate.of(2024, 9, 30))
                            .build(),
                    Demande.builder()
                            .name("Money Withdraw PEA")
                            .type("Money Withdraw PEA")
                            .description("Money Withdraw PEA")
                            .startDate(LocalDate.of(2024, 4, 21))
                            .endDate(LocalDate.of(2024, 10, 30))
                            .build(),
                    Demande.builder()
                            .name("Forward Bank PEA")
                            .type("Forward Bank PEA")
                            .description("Forward Bank PEA")
                            .startDate(LocalDate.of(2024, 4, 21))
                            .endDate(LocalDate.of(2024, 10, 30))
                            .build()

            ));
            dossierService.saveAll(List.of(
                    Dossier.builder()
                            .fileDate(LocalDate.now())
                            .fileName("My name 1")
                            .fileSize("120.Ko")
                            .filePath("C:/work/source/data")
                            .fileType("PDF")
                            .build(),

                    Dossier.builder()
                            .fileDate(LocalDate.now())
                            .fileName("My name 2")
                            .fileSize("180.Ko")
                            .filePath("C:/work/source/data")
                            .fileType("DOC")
                            .build(),

                    Dossier.builder()
                            .fileDate(LocalDate.now())
                            .fileName("My name 3")
                            .fileSize("250.Ko")
                            .filePath("C:/work/source/data")
                            .fileType("XML")
                            .build()
                    ));
        };
    }
}
