INSERT INTO t_user
( i_user, nm, id_number)
VALUES
(1, '홍길동', '950212-1770908');

INSERT INTO t_user
( i_user, nm, id_number, r_dt)
VALUES
(2, '아무개', '950212-1770908', '2020-11-15 12:12:10');

INSERT INTO t_user
( i_user, nm, id_number, r_dt)
VALUES
(10, '아무개', '950212-1770908', '2020-11-15 12:12:10');

DROP DATABASE dddd;
CREATE DATABASE dddd;

SELECT*FROM t_user;
SELECT*FROM t_user2;

INSERT INTO t_user2
(i_user, nm, id_number, r_dt)
SELECT i_user, nm, id_number, r_dt
FROM t_user;