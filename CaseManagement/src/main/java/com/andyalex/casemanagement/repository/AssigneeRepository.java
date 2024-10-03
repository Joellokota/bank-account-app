package com.andyalex.casemanagement.repository;

import com.andyalex.casemanagement.entities.AssigneeTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssigneeRepository extends JpaRepository<AssigneeTask, Long> {

}
