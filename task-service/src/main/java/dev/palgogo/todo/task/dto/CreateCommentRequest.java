package dev.palgogo.todo.task.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@Data
public class CreateCommentRequest {
    private UUID taskId;
    private UUID authorId;
    private String comment;
}
