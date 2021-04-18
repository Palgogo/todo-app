package dev.palgogo.todo.app.service;

import dev.palgogo.todo.app.dto.AttachmentDto;

import java.util.UUID;

public interface AttachmentService {

    AttachmentDto getAttachments(UUID id);
}
