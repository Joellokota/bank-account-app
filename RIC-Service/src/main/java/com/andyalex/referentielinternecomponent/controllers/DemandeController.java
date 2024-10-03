package com.andyalex.referentielinternecomponent.controllers;

import com.andyalex.referentielinternecomponent.entities.Demande;
import com.andyalex.referentielinternecomponent.services.DemandeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class DemandeController {

    private DemandeService demandeService;

    public DemandeController(DemandeService demandeService) {
        this.demandeService = demandeService;
    }
    @GetMapping("/list-demandes")
    public List<Demande> listAllDemandes() {
        return this.demandeService.listDemandeAlls();
    }

    @GetMapping("/list-demandes/{id}")
    public Demande getDemande(@PathVariable Long id) {
        return this.demandeService.getDemandeById(id);
    }
}