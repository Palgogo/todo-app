package dev.palgogo.todo.app.repository;

import dev.palgogo.todo.app.entity.AttachmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AttachmentRepository extends JpaRepository<AttachmentEntity, UUID> {
}
