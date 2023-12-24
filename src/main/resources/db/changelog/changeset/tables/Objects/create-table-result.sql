CREATE TABLE IF NOT EXISTS result
(
    result_id BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    testtaker_id BIGINT REFERENCES testtaker(testtaker_id) ON DELETE CASCADE NOT NULL,
    test_id BIGINT REFERENCES test(test_id) ON DELETE CASCADE NOT NULL,
    result_score INTEGER NOT NULL
);