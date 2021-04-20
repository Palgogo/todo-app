package dev.palgogo.todo.attachment.repository;

import dev.palgogo.todo.attachment.entity.AttachmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AttachmentRepository extends JpaRepository<AttachmentEntity, UUID> {
}
