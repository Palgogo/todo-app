package dev.palgogo.todo.attachment.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "attachments")
public class AttachmentEntity {
    @Id
    private UUID id;

    @Lob
    @Column(name = "file")
    private byte[] file;

    @Column(name = "comment_id")
    private UUID commentId;

    @Column(name = "author_id")
    private UUID authorId;

    @Column(name = "task_id")
    private UUID taskId;
}
