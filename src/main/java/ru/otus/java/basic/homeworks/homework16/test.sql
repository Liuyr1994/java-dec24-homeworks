CREATE TABLE test
(
    id    SERIAL PRIMARY KEY,
    title TEXT NOT NULL
);

CREATE TABLE question
(
    id      SERIAL PRIMARY KEY,
    test_id INT  NOT NULL,
    text    TEXT NOT NULL,
    CONSTRAINT question_test_fk FOREIGN KEY (test_id) REFERENCES test (id) ON DELETE CASCADE
);

CREATE TABLE answer
(
    id          SERIAL PRIMARY KEY,
    question_id INT     NOT NULL,
    text        TEXT    NOT NULL,
    is_correct  BOOLEAN NOT NULL DEFAULT FALSE,
    CONSTRAINT answer_question_fk FOREIGN KEY (question_id) REFERENCES question (id) ON DELETE CASCADE
)
