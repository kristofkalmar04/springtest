package com.example.TodoApp.controller;

import com.example.TodoApp.dto.TaskDTO;
import com.example.TodoApp.entity.Task;
import com.example.TodoApp.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private TaskService service;

    @PostMapping("/task")
    public Task createTask(@RequestParam(name="text", required=true) String text)
    {
        return service.createTask(new Task(text));
    }

    @GetMapping("/task")
    public List<TaskDTO> getTask(@RequestParam(name="text", required=true) String text)
    {
        return service.getTask(text);
    }
}
