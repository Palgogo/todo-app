CREATE TABLE IF NOT EXISTS attachments
(
    id        UUID DEFAULT gen_random_uuid(),
    file      BYTEA,
    author_id UUID NOT NULL,
    task_id   UUID NULL,
    comment_id   UUID  NULL,

    CONSTRAINT "pk_attachment" PRIMARY KEY (id),
    FOREIGN KEY (author_id) REFERENCES users (id),
    FOREIGN KEY (task_id) REFERENCES tasks (id),
    FOREIGN KEY (comment_id) REFERENCES comments (id)
);

CREATE INDEX IF NOT EXISTS "attachment_author_id_idx" ON attachments USING btree (author_id);
CREATE INDEX IF NOT EXISTS "attachment_task_id_idx" ON attachments USING btree (task_id);
CREATE INDEX IF NOT EXISTS "attachment_comment_id_idx" ON attachments USING btree (comment_id);