package dev.palgogo.todo.attachment.service;

import dev.palgogo.todo.attachment.dto.AttachmentDto;

import java.util.UUID;

public interface AttachmentService {

    AttachmentDto getAttachments(UUID id);
}
