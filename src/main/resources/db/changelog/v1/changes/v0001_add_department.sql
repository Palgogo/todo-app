CREATE TABLE IF NOT EXISTS department
(
    id   UUID DEFAULT gen_random_uuid(),
    name VARCHAR(100) NOT NULL,
    CONSTRAINT "pk_department" PRIMARY KEY ("id")
);