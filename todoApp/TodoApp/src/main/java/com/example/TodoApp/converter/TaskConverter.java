package com.example.TodoApp.converter;

import com.example.TodoApp.dto.TaskDTO;
import com.example.TodoApp.entity.Task;
import org.springframework.stereotype.Component;

@Component
public class TaskConverter {
    public TaskDTO toDTO(Task task) {
        return new TaskDTO(task.getId(), task.getText(), task.isCompleted());
    }
}
