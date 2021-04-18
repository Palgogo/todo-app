package dev.palgogo.todo.app.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CommentDto {
    private String id;
    private String text;
    private String authorId;
    private String taskId;
    private String createdAt;
    private String updatedAt;
}
