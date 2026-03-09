package com.example.demo.infrastructure;


import com.example.demo.application.Task;
import com.example.demo.application.TaskUseCase;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TaskController {

    private TaskUseCase taskUseCase;

    public TaskController(TaskUseCase taskUseCase) {
        this.taskUseCase = taskUseCase;
    }

    @GetMapping("/tasks")
    public String getTasks() {
        return taskUseCase.getTasks().toString();
    }

    @PostMapping("/tasks")
    public String createTask(@Valid @RequestBody Task task) {
     return null;
    }
}
