package dev.palgogo.todo.task.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
public class UpdateAssigneeRequest {
    private UUID assigneeId;
}
