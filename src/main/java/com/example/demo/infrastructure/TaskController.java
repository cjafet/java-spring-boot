package com.example.demo.infrastructure;


import com.example.demo.application.Task;
import com.example.demo.application.TaskUseCase;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TaskController {

    private TaskUseCase taskUseCase;

    public TaskController(TaskUseCase taskUseCase) {
        this.taskUseCase = taskUseCase;
    }

    @GetMapping("/tasks")
    public List<com.example.demo.domain.Task> getTasks() {
        return taskUseCase.getTasks();
    }

    @PostMapping("/tasks")
    public String createTask(@Valid @RequestBody com.example.demo.domain.Task task) {
     return null;
    }
}
