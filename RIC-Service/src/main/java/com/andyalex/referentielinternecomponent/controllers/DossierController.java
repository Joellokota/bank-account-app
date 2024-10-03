package com.andyalex.referentielinternecomponent.controllers;

import com.andyalex.referentielinternecomponent.entities.Dossier;
import com.andyalex.referentielinternecomponent.services.DossierService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class DossierController {

    private DossierService dossierService;

    public DossierController(DossierService dossierService) {
        this.dossierService = dossierService;
    }

    @GetMapping("/listDossier")
    public List<Dossier> dossierList(){
        return this.dossierService.listDossierAll();
    }

    @GetMapping("/listDossier/{id}")
    public Dossier getDossierById(@PathVariable Long id){
        return this.dossierService.getDossier(id);
    }

}
