package com.andyalex.casemanagement.controller;

import com.andyalex.casemanagement.entities.Task;
import com.andyalex.casemanagement.services.TaskService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class TaskController {

/*    @Value("${case.management.params.x}")
    private String params_p1;
    @Value("${case.management.params.y}")
    private String params_p2;
    @Value("${global.params.p1}")
    private String global_params_p1;
    @Value("${global.params.p2}")
    private String global_params_p2;*/

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

/*    @GetMapping("/params")
    public Map<String, String> getParams() {
        return Map.of("p1", params_p1, "p2", params_p2, "p3", global_params_p1, "p4", global_params_p2);

    }*/
}