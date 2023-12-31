CREATE TABLE IF NOT EXISTS question
(
    question_id BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    test_id BIGINT REFERENCES test(test_id) ON DELETE CASCADE NOT NULL,
    question_text VARCHAR(256) NOT NULL,
    question_value INTEGER NOT NULL
);