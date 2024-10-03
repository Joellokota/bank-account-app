package com.andyalex.referentielinternecomponent.repositories;

import com.andyalex.referentielinternecomponent.entities.Dossier;
import org.springframework.data.repository.CrudRepository;

public interface DossierRepository extends CrudRepository<Dossier, Long> {
}
