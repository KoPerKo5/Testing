CREATE TABLE IF NOT EXISTS test
(
    test_id BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    test_title VARCHAR(55) NOT NULL,
    test_number_of_questions INTEGER NOT NULL
);