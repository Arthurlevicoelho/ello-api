CREATE TABLE IF NOT EXISTS "ello"."payment_information" (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    type_payment VARCHAR(50) NOT NULL,
    discount DOUBLE PRECISION,
    billing_date DATE,
    user_id UUID REFERENCES "ello"."user"(id) ON DELETE SET NULL
);