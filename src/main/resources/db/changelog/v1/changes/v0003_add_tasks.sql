CREATE TABLE IF NOT EXISTS tasks
(
    id          UUID DEFAULT gen_random_uuid(),
    created_at  TIMESTAMP    NOT NULL,
    theme       VARCHAR(255) NOT NULL,
    description TEXT,
    author_id   UUID         NOT NULL,
    assignee_id UUID         NULL,
    status      VARCHAR(100),

    CONSTRAINT "pk_task" PRIMARY KEY (id),
    FOREIGN KEY (author_id) REFERENCES users (id),
    FOREIGN KEY (assignee_id) REFERENCES users (id)
);

CREATE INDEX IF NOT EXISTS "task_author_id_idx" ON tasks USING btree (author_id);
CREATE INDEX IF NOT EXISTS "task_assignee_id_idx" ON tasks USING btree (assignee_id);