package dev.palgogo.todo.app.dto;

import dev.palgogo.todo.app.entity.TaskStatus;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.UUID;

@Data
@Builder
public class TaskDto {
    private UUID id;
    private Instant createdAt;
    private String theme;
    private String description;
    private UserDto author;
    private UserDto assignee;
    private TaskStatus status;

}
