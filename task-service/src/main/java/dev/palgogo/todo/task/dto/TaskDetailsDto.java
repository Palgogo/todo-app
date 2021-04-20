package dev.palgogo.todo.task.dto;

import dev.palgogo.todo.attachment.dto.AttachmentDto;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class TaskDetailsDto {
    private List<CommentDto> comments;
    private List<AttachmentDto> attachments;
}
