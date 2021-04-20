CREATE TABLE IF NOT EXISTS users
(
    id            UUID DEFAULT gen_random_uuid(),
    first_name    VARCHAR(100) NOT NULL,
    last_name     VARCHAR(100) NOT NULL,
    department_id UUID        NULL,

    CONSTRAINT "pk_user" PRIMARY KEY (id),
    FOREIGN KEY (department_id) REFERENCES departments (id)
);

CREATE INDEX IF NOT EXISTS "user_department_id_idx" ON users USING btree (department_id);