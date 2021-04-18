package dev.palgogo.todo.app.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class CreateTaskRequest {

    private String theme;
    private String description;
    private UUID authorId;
    private UUID assigneeId;
}
