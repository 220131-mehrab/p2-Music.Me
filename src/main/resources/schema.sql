CREATE TABLE "userdata" (
    "id" SERIAL PRIMARY KEY NOT NULL,
    "username" VARCHAR NOT NULL,
    "email" VARCHAR,
    "password" VARCHAR
);

INSERT INTO "userdata" VALUES (1,"Darryl", "darrylbraijon152@revature.net", "#1love2C0de");
