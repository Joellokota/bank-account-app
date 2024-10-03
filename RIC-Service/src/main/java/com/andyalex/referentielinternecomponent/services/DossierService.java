package com.andyalex.referentielinternecomponent.services;

import com.andyalex.referentielinternecomponent.entities.Dossier;
import com.andyalex.referentielinternecomponent.repositories.DossierRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DossierService {
    private final DossierRepository dossierRepository;

    public DossierService(DossierRepository dossierRepository) {
        this.dossierRepository = dossierRepository;
    }

    public List<Dossier> listDossierAll() {
        return (List<Dossier>) this.dossierRepository.findAll();
    }

    public Dossier getDossier(Long id) {
        return this.dossierRepository.findById(id).get();
    }

    public List<Dossier> saveAll(List<Dossier> build) {
        return (List<Dossier>) this.dossierRepository.saveAll(build);
    }
}
