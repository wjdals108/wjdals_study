CREATE TABLE t_student(
	stu_number INT UNSIGNED PRIMARY KEY,
	stu_name VARCHAR(10) NOT NULL,
	stu_major VARCHAR(10) NOT NULL,
	stu_add VARCHAR(10) NOT NULL
);

CREATE TABLE t_b(
	class_name VARCHAR(10) NOT NULL PRIMARY KEY,
	class_place VARCHAR(10) NOT NULL
);

CREATE TABLE t_c(
	stu_number INT UNSIGNED,
	class_name VARCHAR(10) NOT NULL,
	PRIMARY KEY(stu_number, class_name),
	FOREIGN KEY (stu_number) REFERENCES t_student(stu_number),
	FOREIGN KEY (class_name) REFERENCES t_b(class_name)
);