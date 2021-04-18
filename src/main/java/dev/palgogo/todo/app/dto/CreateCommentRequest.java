package dev.palgogo.todo.app.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@Data
public class CreateCommentRequest {
    private UUID authorId;
    private String comment;
}
