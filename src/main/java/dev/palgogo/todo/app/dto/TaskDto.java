package dev.palgogo.todo.app.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import dev.palgogo.todo.app.entity.TaskStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class TaskDto {

    private UUID id;
    private Instant createdAt;
    private String theme;
    private String description;
    private UserDto author;
    private UserDto assignee;
    private TaskStatus status;
    private DepartmentDto department;
}
