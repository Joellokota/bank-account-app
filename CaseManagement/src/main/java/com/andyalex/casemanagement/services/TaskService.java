package com.andyalex.casemanagement.services;

import com.andyalex.casemanagement.entities.Task;
import com.andyalex.casemanagement.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    public List<Task> saveAllTask(List<Task> task) {
        return taskRepository.saveAll(task);
    }
    public List<Task> findAllTasks() {
        return taskRepository.findAll();
    }

    public Task findTaskByID(long id) {
        return this.taskRepository.findById(id).get();
    }
}
