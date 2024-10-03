package com.andyalex.referentielinternecomponent.services;

import com.andyalex.referentielinternecomponent.entities.Demande;
import com.andyalex.referentielinternecomponent.repositories.DemandeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemandeService {
    private final DemandeRepository demandeRepository;

    public DemandeService(DemandeRepository demandeRepository) {
        this.demandeRepository = demandeRepository;
    }

    public List<Demande> listDemandeAlls() {
        return (List<Demande>) this.demandeRepository.findAll();
    }

    public Demande getDemandeById(Long id) {
        return this.demandeRepository.findById(id).get();
    }

    public List<Demande> saveAll(List<Demande> demandes) {
        return (List<Demande>) this.demandeRepository.saveAll(demandes);
    }
}
