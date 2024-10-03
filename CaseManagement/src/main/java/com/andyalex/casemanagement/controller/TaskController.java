package com.andyalex.casemanagement.controller;

import com.andyalex.casemanagement.entities.Task;
import com.andyalex.casemanagement.services.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class TaskController {
    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("list-tasks")
    public List<Task> getTasks() {
        return this.taskService.findAllTasks();
    }

    @GetMapping("list-tasks/{id}")
    public Task getTaskById(@PathVariable long id) {
        return this.taskService.findTaskByID(id);
    }
}