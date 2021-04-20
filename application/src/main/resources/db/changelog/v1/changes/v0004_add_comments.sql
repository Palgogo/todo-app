CREATE TABLE IF NOT EXISTS comments
(
    id         UUID DEFAULT gen_random_uuid(),
    created_at TIMESTAMP NOT NULL,
    updated_at TIMESTAMP NOT NULL,
    text       TEXT,
    author_id  UUID      NOT NULL,
    task_id    UUID      NOT NULL,

    CONSTRAINT "pk_comment" PRIMARY KEY (id),
    FOREIGN KEY (author_id) REFERENCES users (id),
    FOREIGN KEY (task_id) REFERENCES tasks (id)
);

CREATE INDEX IF NOT EXISTS "comment_author_id_idx" ON comments USING btree (author_id);
CREATE INDEX IF NOT EXISTS "comment_task_id_idx" ON comments USING btree (task_id);