DROP DATABASE IF EXISTS final_exam;
CREATE DATABASE final_exam;
USE final_exam;

DROP TABLE IF EXISTS users;
CREATE TABLE users (
    id          INT PRIMARY KEY AUTO_INCREMENT,
    full_name   VARCHAR(50)                     NOT NULL,
    email       VARCHAR(50) UNIQUE KEY          NOT NULL,
    password    VARCHAR(50)                     NOT NULL DEFAULT '123456Q',
    role        ENUM('EMPLOYEE', 'ADMIN')       NOT NULL DEFAULT 'EMPLOYEE',
    pro_skill   VARCHAR(50),
    exp_in_year INT
);

INSERT INTO users (full_name        , email              , password  , role		 , pro_skill, exp_in_year)
VALUES            ('Phạm Gia Ân', 'an.pg@gmail.com', '123456Q' , 'ADMIN', 'Java'   , NULL       ),
				  ('Đào Thị Tố Uyên', 'uyen.dtt@gmail.com' , '123456Q' , 'EMPLOYEE''ADMIN'   , NULL     , 10         );

DROP PROCEDURE IF EXISTS find_by_email_and_password;
DELIMITER $$
CREATE PROCEDURE find_by_email_and_password (
	IN in_email     VARCHAR(50),
    IN in_password  VARCHAR(50)
)
BEGIN
	SELECT *
	FROM users
	WHERE email = in_email AND password = in_password;
END $$
DELIMITER ;