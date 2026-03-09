package com.example.demo.infrastructure;


import com.example.demo.application.Task;
import com.example.demo.application.TaskUseCase;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("api/")
public class TaskController {

    private TaskUseCase taskUseCase;

    public TaskController(TaskUseCase taskUseCase) {
        this.taskUseCase = taskUseCase;
    }

    @GetMapping("/tasks")
    public String getTaskz() {
        return taskUseCase.getTasks().toString();
    }

    @PostMapping("/tasks")
    public String createTask(@Valid @RequestBody Task task) {
     return null;
    }
}
