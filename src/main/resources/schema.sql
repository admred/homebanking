DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS transactions;
DROP TABLE IF EXISTS accounts;

CREATE TABLE users (
    id          BIGINT AUTO_INCREMENT,
    email       VARCHAR(255) NOT NULL UNIQUE,
    password    VARCHAR(255) NOT NULL,
    fullname    VARCHAR(255) NOT NULL,
    address     VARCHAR(255) NOT NULL,
    city        VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);


CREATE TABLE transactions (
    id              BIGINT AUTO_INCREMENT,
    'timestamp'     CURRENT_TIMESTAMP,
    'from'          BIGINT  NOT NULL,
    'to'            BIGINT  NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY ('from') REFERENCES users(id),
    FOREIGN KEY ('to') REFERENCES users(id)
 );

CREATE TABLE accounts (
    id          BIGINT AUTO_INCREMENT,
    balance     DECIMAL NOT NULL,
    PRIMARY KEY (id)
);


INSERT INTO users (email,password,fullname) VALUES
    ('test123@example.com','test123','Test 123','Direccion Test','Ciudad Test'),
    ('liome@example.com','messirve','Lionel Messi','Av. 1234','Rosario'),
    ('sanmartin@example.com','procer123','San Martin','Av. San Margin','Buenos Aires');