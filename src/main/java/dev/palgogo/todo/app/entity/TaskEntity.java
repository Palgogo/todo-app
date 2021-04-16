package dev.palgogo.todo.app.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "users")
public class TaskEntity {

    @Id
    private UUID id;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "theme")
    private String theme;

    @Column(name = "description")
    private String description;

    @Column(name = "author_id")
    private UUID authorId;

    @Column(name = "assignee_id")
    private UUID assigneeId;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private TaskStatus status;
}
