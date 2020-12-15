CREATE TABLE t_hobby(
	i_hobby INT UNSIGNED PRIMARY KEY,
	nm VARCHAR(10) NOT NULL
);

INSERT INTO t_hobby
(i_hobby, nm)
VALUES
(1, '운동'), (2, '게임'), (3, '농구'), (4, '볼링'), (5, '독서'); 

SELECT * FROM t_hobby;
SELECT * FROM t_user;