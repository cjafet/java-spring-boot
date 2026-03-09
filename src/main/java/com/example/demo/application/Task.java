package com.example.demo.application;

import java.util.List;

public interface Task {
    Task create(Task task);
    List<com.example.demo.domain.Task> getTasks();
}
