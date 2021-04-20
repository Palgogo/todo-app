package dev.palgogo.todo.task.repository;

import dev.palgogo.todo.task.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CommentRepository extends JpaRepository<CommentEntity, UUID> {
}
