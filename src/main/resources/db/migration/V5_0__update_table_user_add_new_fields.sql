ALTER TABLE "ello"."user"
ADD COLUMN email VARCHAR(255) UNIQUE,
ADD COLUMN functional_information_id UUID REFERENCES "ello"."functional_information"(id),
ADD COLUMN payment_information_id UUID REFERENCES "ello"."payment_information"(id),
ADD COLUMN medical_information_id UUID REFERENCES "ello"."medical_information"(id);

CREATE INDEX idx_user_functional_information ON "ello"."user" (functional_information_id);
CREATE INDEX idx_user_payment_information ON "ello"."user" (payment_information_id);
CREATE INDEX idx_user_medical_information ON "ello"."user" (medical_information_id);
