DROP TABLE t_user_hobby;
CREATE TABLE t_user_hobby(
	i_user INT UNSIGNED,
	i_hobby INT UNSIGNED,
	PRIMARY KEY(i_user, i_hobby),
	FOREIGN KEY (i_user) REFERENCES t_user(i_user),
	FOREIGN KEY (i_hobby) REFERENCES t_hobby(i_hobby)
);

INSERT INTO t_user_hobby
(i_user, i_hobby)
VALUES
(3, 4);

SELECT 
	A.*
	, ifnull(B.nm, '사람없음') AS user_nm
	, ifnull(B.id_number, '') AS id_number
	, C.nm AS hobby_nm
FROM t_user_hobby A
INNER JOIN t_user B
ON A.i_user = B.i_user
LEFT JOIN t_hobby C
ON A.i_hobby = C.i_hobby
;


