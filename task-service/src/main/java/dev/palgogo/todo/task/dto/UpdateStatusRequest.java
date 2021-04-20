package dev.palgogo.todo.task.dto;

import dev.palgogo.todo.task.entity.TaskStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UpdateStatusRequest {
    private TaskStatus status;
}
