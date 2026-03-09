package com.example.demo.application;

import com.example.demo.infrastructure.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TaskUseCase implements Task {

    private TaskRepository taskRepository;

    public TaskUseCase(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task create(Task task) {
        return task;
    }

    @Override
    public List<com.example.demo.domain.Task> getTasks() {
        return taskRepository.getTasks();
    }
}
