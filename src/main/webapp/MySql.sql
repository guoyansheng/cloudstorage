/* 创建用户表*/
CREATE TABLE USER(
   id INT PRIMARY KEY AUTO_INCREMENT COMMENT '主键，没有实际作用',
   user_id VARCHAR(20) NOT NULL  COMMENT '用户编号',
   login_name_email VARCHAR(50) COMMENT '登录名(邮箱)',
   login_name_mobile VARCHAR(50) COMMENT '登录名(手机号)',
   login_password VARCHAR(20) NOT NULL  COMMENT '登录密码',
   payment_password VARCHAR(20) NOT NULL  COMMENT '支付密码',
   nick_name VARCHAR(50)  COMMENT '花名',
   real_name VARCHAR(50) COMMENT '真实姓名',
   card_type VARCHAR(30) COMMENT '证件类型',
   card_No VARCHAR(30) COMMENT '证件编号',
   address VARCHAR(50) COMMENT '地址',
   phone VARCHAR(20) COMMENT '电话',
   mobile_no  VARCHAR(20) COMMENT '手机号',
   email  VARCHAR(50) COMMENT '邮箱',
   birthdate DATE  COMMENT '出生日期',
   constellation  VARCHAR(6) COMMENT '星座',
   age SMALLINT COMMENT '年龄',
   income INT COMMENT '月收入',
   height SMALLINT COMMENT '身高',
   weight SMALLINT COMMENT '体重',
   job VARCHAR(20) COMMENT '职业',
   interest VARCHAR(50) COMMENT '职业',
   introduce VARCHAR(200) COMMENT '个人简介',
   note VARCHAR(200) COMMENT '备注'
) COMMENT '主键';
/*ALTER TABLE USER DROP INDEX catename; *//
CREATE UNIQUE INDEX unique_login_name_email ON USER(login_name_email); 
CREATE UNIQUE INDEX unique_login_name_mobile ON USER(login_name_mobile); 
CREATE UNIQUE INDEX unique_card_No ON USER(card_No); 
CREATE INDEX index_nick_name ON USER(nick_name); 
CREATE INDEX index_real_name ON USER(real_name);
