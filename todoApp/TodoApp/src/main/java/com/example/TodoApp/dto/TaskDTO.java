package com.example.TodoApp.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
public class TaskDTO {
    @Setter
    private long id;
    @Setter
    @Getter
    private String text;

    public TaskDTO(long id, String text)
    {
        this.id = id;
        this.text = text;
    }
}
