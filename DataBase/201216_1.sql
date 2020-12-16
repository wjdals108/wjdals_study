CREATE TABLE t_product(
	product_no INT UNSIGNED PRIMARY KEY,
	product_nm VARCHAR(10) NOT NULL,
	stock_qty INT UNSIGNED
	);
	
INSERT INTO t_product
(product_no, product_nm, stock_qty)
VALUE
(1001, '모니터', 2000), (1007, '마우스', 9000), (1201, '키보드', 2100);
	
CREATE TABLE t_user(
	user_no INT UNSIGNED PRIMARY KEY,
	addr VARCHAR(10) NOT NULL
	);

INSERT INTO t_user
(user_no, addr)
VALUE
(100, '서울'), (200, '부산'), (300, '광주');

CREATE TABLE t_order(
	order_no VARCHAR(10) NOT NULL PRIMARY KEY,
	user_no int UNSIGNED,
	order_date DATE DEFAULT NOW()
	);

INSERT INTO t_order
(order_no, user_no, order_date)
VALUE
('A345', 100, '2012-12-10'), ('A210', 300, '2012-12-11'), ('B230', 200, '2012-12-12'), ('D347', 200, '2012-12-13');	


CREATE TABLE t_order_d(
	order_no VARCHAR(10) NOT NULL,
	product_no INT UNSIGNED,
	order_qty INT UNSIGNED,
	PRIMARY KEY(order_no, product_no),
	FOREIGN KEY (order_no) REFERENCES t_order(order_no),
	FOREIGN KEY (product_no) REFERENCES t_product(product_no)
);


INSERT INTO t_order_d
(order_no, product_no, order_qty)
VALUE
('A345', 1001, 150), ('A345', 1007, 400), ('A210', 1007, 600), ('B230', 1007, 700), ('D347', 1201, 700), ('D347', 1001, 300);	

SELECT t_product.*, t_order.*, t_order_d.*
FROM t_order_d
LEFT JOIN t_order
ON t_order_d.order_no = t_order.order_no
LEFT JOIN t_product
ON t_order_d.product_no = t_product.product_no
;
	
	#product_no INT UNSIGNED,
	#product_nm VARCHAR NOT NULL,
	#stock_qty INT UNSIGNED,
	#order_no varchar not null,
	#user_no int unsigned,
	#addr VARCHAR NOT NULL,
	#order_qty INT unsigned,
	#order_date varchar not null