package com.example.demo.application;

import java.util.List;
import java.util.UUID;

public interface Task {
    Task create(Task task);
    List<com.example.demo.domain.Task> getTasks();
}
