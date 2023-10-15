DROP TABLE IF EXISTS users;

CREATE TABLE users (
    id          BIGINT AUTO_INCREMENT,
    email       VARCHAR(255) NOT NULL,
    password    VARCHAR(255) NOT NULL,
    fullname    VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO users (email,password,fullname) VALUES
    ('test123@example.com','test123','Test 123'),
    ('liome@example.com','lio1234','Lionel Messi'),
    ('sanmartin@example.com','procer123','San Martin'),
    ('apel@example.com','guessme','Steve Jobs');
