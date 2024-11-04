CREATE TABLE IF NOT EXISTS "ello"."medical_information" (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    allergies VARCHAR(255),
    frequently_used_medication VARCHAR(255),
    emergency_contact VARCHAR(255),
    user_id UUID REFERENCES "ello"."user"(id) ON DELETE SET NULL
);