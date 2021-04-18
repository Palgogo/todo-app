package dev.palgogo.todo.app.dto;

import dev.palgogo.todo.app.entity.TaskStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UpdateStatusRequest {
    private TaskStatus status;
}
