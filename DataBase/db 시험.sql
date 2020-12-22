CREATE TABLE T_ORDER(
	o_no INT UNSIGNED PRIMARY KEY,
	cus_no INT UNSIGNED,
	o_date DATE DEFAULT NOW(),
	o_price INT UNSIGNED,
	FOREIGN KEY (cus_no) REFERENCES T_CUSTOMER(cus_no)
);

CREATE TABLE T_CUSTOMER(
	cus_no INT UNSIGNED PRIMARY KEY,
	nm VARCHAR(10)
);


INSERT INTO T_ORDER
(o_no, cus_no, o_price)
VALUES
(1, 3, 55000), (2, 5, 70000), (3, 3, 60000);


INSERT INTO t_customer
(cus_no, nm)
VALUES
(3, '홍길동'), (5, '이순신');

UPDATE t_customer
SET nm = '장보고'
WHERE cus_no = 5;

DELETE FROM t_order
WHERE o_no = 2;

SELECT * FROM t_order;
SELECT * FROM t_order WHERE cus_no = 3;
SELECT o_no, o_price FROM t_order WHERE cus_no = 3;


SHOW FULL TABLES;

SHOW INDEX FROM T_ORDER;

SHOW FULL TABLES WHERE TABLE_TYPE LIKE 'VIEW';



CREATE INDEX idx_customer_nm ON t_customer(nm);

SHOW INDEX FROM t_customer;

ALTER TABLE t_customer DROP INDEX idx_customer_nm;




SELECT t_order.o_no, t_order.o_date, t_order.o_price, t_customer.nm
FROM t_order
LEFT JOIN t_customer
ON t_order.cus_no = t_customer.cus_no;

CREATE VIEW view_order_info AS
SELECT t_order.o_no, t_order.o_date, t_order.o_price, t_customer.nm
FROM t_order
LEFT JOIN t_customer
ON t_order.cus_no = t_customer.cus_no;

DROP VIEW view_order_info;