package com.example.demo.infrastructure;


import com.example.demo.domain.Task;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TaskRepository {

    List<com.example.demo.domain.Task> tasks = List.of(
            new Task("f5af0d90-30b0-4bc8-848d-8efc321b3ef8", "Add User Pagination", false),
            new Task("224b2828-944f-4893-a2ed-9310854ed130", "Add Task Pagination", false),
            new Task("ba0f1c0a-95e5-4d3f-a9c7-0ebef28732d7", "Add Tasks Pagination Cont", false)
    );

    public List<com.example.demo.domain.Task> getTasks() {
        return tasks;
    }
}
