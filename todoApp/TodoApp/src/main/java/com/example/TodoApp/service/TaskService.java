package com.example.TodoApp.service;

import com.example.TodoApp.converter.TaskConverter;
import com.example.TodoApp.dto.TaskDTO;
import com.example.TodoApp.entity.Task;
import com.example.TodoApp.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {
    @Autowired
    TaskRepository repo;
    @Autowired
    TaskConverter converter;

    public Task createTask(Task task)
    {
        return repo.save(task);
    }

    public List<TaskDTO> getTask(String text)
    {
        List<TaskDTO> tasks = new ArrayList<>();

        repo.findAll().forEach(task -> {
            TaskDTO taskDTO = new TaskDTO(task.getId(), task.getText());

            tasks.add(taskDTO);
        });

        return tasks;
    }
}
