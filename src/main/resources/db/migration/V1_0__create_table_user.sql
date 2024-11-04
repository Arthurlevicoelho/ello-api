CREATE TABLE IF NOT EXISTS "ello"."user"(
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    name VARCHAR(255),
    birthday DATE,
    gender VARCHAR(50),
    telephone VARCHAR(50),
    address VARCHAR(255)
);