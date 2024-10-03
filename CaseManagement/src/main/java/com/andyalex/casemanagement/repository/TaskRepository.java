package com.andyalex.casemanagement.repository;

import com.andyalex.casemanagement.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
