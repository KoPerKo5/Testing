CREATE TABLE IF NOT EXISTS answer
(
    answer_id BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    question_id BIGINT REFERENCES question(question_id) ON DELETE CASCADE NOT NULL,
    answer_text VARCHAR(256) NOT NULL,
    answer_truth BOOLEAN NOT NULL
);