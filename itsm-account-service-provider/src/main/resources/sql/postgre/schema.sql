drop table if exists t_um_user;
CREATE TABLE t_um_user
(
  id uuid PRIMARY KEY NOT NULL,
  login_name VARCHAR(16) NOT NULL UNIQUE,
  passwd VARCHAR(32) NOT NULL ,
  name VARCHAR(32) NOT NULL ,
  phone VARCHAR(11),
  email VARCHAR(32),
  department_name VARCHAR(32),
  status VARCHAR(32) DEFAULT 'OK',
  last_login_time BIGINT,
  login_address VARCHAR(16),
  remark VARCHAR(256),
  locked VARCHAR(16) DEFAULT 'F',
  ip VARCHAR(256),
  enterprise_id VARCHAR(36)
);