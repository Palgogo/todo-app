package dev.palgogo.todo.app.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class TaskDetailsDto {
    private List<CommentDto> comments;
    private List<AttachmentDto> attachments;
}
