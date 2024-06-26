package com.example.TodoApp.controller;

import com.example.TodoApp.dto.TaskDTO;
import com.example.TodoApp.entity.Task;
import com.example.TodoApp.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private TaskService service;

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/task")
    public Task createTask(@RequestParam(name="text", required=true) String text)
    {
        return service.createTask(new Task(text, false));
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/task")
    public List<TaskDTO> getTask()
    {
        return service.getTasks();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/task")
    public void deleteTask(@RequestParam(name="id", required=true) int id)
    {
        service.deleteTask(id);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping("/task")
    public void updateTaskChecked(@RequestParam(name="id", required=true) int id)
    {
        service.updateTaskChecked(id);
    }
}
