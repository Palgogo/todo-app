package dev.palgogo.todo.app.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.OutputStream;
import java.util.UUID;

@Data
@NoArgsConstructor
public class AttachmentDto {
    private UUID authorId;
    private UUID taskId;
    private UUID commentId;
    private OutputStream file;
}
