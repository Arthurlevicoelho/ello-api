CREATE TABLE IF NOT EXISTS "ello"."functional_information" (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    acquisition_date DATE,
    day_shift VARCHAR(50),
    time VARCHAR(50),
    user_id UUID REFERENCES "ello"."user"(id) ON DELETE SET NULL
);