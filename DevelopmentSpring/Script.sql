--<ScriptOptions statementTerminator=";"/>

CREATE TABLE users (
	ID INT NOT NULL,
	NAME VARCHAR(255),
	TOTAL INT,
	GOAL INT,
	PRIMARY KEY (ID)
) ENGINE=InnoDB;

