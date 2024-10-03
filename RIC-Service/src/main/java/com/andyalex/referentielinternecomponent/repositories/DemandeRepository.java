package com.andyalex.referentielinternecomponent.repositories;

import com.andyalex.referentielinternecomponent.entities.Demande;
import org.springframework.data.repository.CrudRepository;

public interface DemandeRepository extends CrudRepository<Demande, Long> {
}
