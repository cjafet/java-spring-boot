package com.example.demo.domain;


import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {

    private String taskId;
    @NotEmpty
    private String title;
    private Boolean completed;
}
