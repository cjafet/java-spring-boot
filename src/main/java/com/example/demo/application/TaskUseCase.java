package com.example.demo.application;

import com.example.demo.infrastructure.TaskRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
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
        log.info("Returning list of tasks");
        try {
            return taskRepository.getTasks();
        } catch (Exception ex) {
            log.error("An unexpected error occurred. Try again later.");
            throw new RuntimeException("An unexpected error occurred. Try again later.");
        }
    }
}
