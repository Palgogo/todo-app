package dev.palgogo.todo.app.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
public class UpdateAssigneeRequest {
    private UUID assigneeId;
}
