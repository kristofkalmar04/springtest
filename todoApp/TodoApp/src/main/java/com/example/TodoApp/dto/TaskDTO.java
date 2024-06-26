package com.example.TodoApp.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
public class TaskDTO {
    @Setter
    @Getter
    private long id;
    @Setter
    @Getter
    private String text;
    @Getter
    @Setter
    private boolean completed;

    public TaskDTO(long id, String text, boolean completed)
    {
        this.id = id;
        this.text = text;
        this.completed = completed;
    }
}
