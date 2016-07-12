drop table if EXISTS  t_um_user;
CREATE TABLE t_um_user
(
  id uuid PRIMARY KEY NOT NULL,
  login_name VARCHAR(16) NOT NULL UNIQUE, --'登录名'
  passwd VARCHAR(32) NOT NULL , -- 密码
  name VARCHAR(32) NOT NULL , -- 名称
  phone VARCHAR(11), -- 电话
  email VARCHAR(32), -- 邮件
  department_name VARCHAR(32), -- 部门名称
  status VARCHAR(32) DEFAULT 'OK', -- 状态
  last_login_time BIGINT, -- 最后登录时间
  login_address VARCHAR(16), -- 登录ip
  remark VARCHAR(256), -- 描述描述
  locked VARCHAR(16) DEFAULT  'F', -- 锁定
  ip VARCHAR(256), -- 登录ip
  enterprise_id VARCHAR(36) -- 企业id
);

ALTER TABLE t_um_user OWNER TO postgres;
COMMENT ON TABLE t_um_user IS '用户表';
COMMENT ON COLUMN t_um_user.login_name IS '登录名';
COMMENT ON COLUMN t_um_user.passwd IS '密码';
COMMENT ON COLUMN t_um_user.name IS '名称';
COMMENT ON COLUMN t_um_user.phone IS '电话';
COMMENT ON COLUMN t_um_user.email IS '邮件';
COMMENT ON COLUMN t_um_user.department_name IS '部门名称';
COMMENT ON COLUMN t_um_user.status IS '状态';
COMMENT ON COLUMN t_um_user.last_login_time IS '最后登录时间';
COMMENT ON COLUMN t_um_user.login_address IS '登录ip';
COMMENT ON COLUMN t_um_user.remark IS '描述描述';
COMMENT ON COLUMN t_um_user.locked IS '锁定';
COMMENT ON COLUMN t_um_user.ip IS '登录ip';
COMMENT ON COLUMN t_um_user.enterprise_id IS '企业id';

drop table if EXISTS  t_um_function;
CREATE TABLE t_um_function (
  id uuid PRIMARY KEY NOT NULL,
  module_name character varying(64),
  name character varying(64),
  funct_desc character varying(64),
  privilege character(2),
  status VARCHAR(32) DEFAULT 'OK' -- 状态
);
ALTER TABLE t_um_function OWNER TO postgres;
COMMENT ON TABLE t_um_function IS '功能表';
COMMENT ON COLUMN t_um_function.module_name IS '模块名称';
COMMENT ON COLUMN t_um_function.name IS '名称英文';
COMMENT ON COLUMN t_um_function.funct_desc IS '描述';
COMMENT ON COLUMN t_um_function.privilege IS '特权';

drop table if EXISTS  t_um_role;
CREATE TABLE t_um_role(
  id uuid PRIMARY KEY NOT NULL,
  name character varying(31),
  describe character varying(256),
  status VARCHAR(32) DEFAULT 'OK' -- 状态
);
ALTER TABLE t_um_role OWNER TO postgres;
COMMENT ON TABLE t_um_role IS '角色表';
COMMENT ON COLUMN t_um_role.name IS '名称';
COMMENT ON COLUMN t_um_role.describe IS '描述';