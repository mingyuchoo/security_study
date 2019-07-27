CREATE TABLE home (
  idx bigint NOT NULL AUTO_INCREMENT
, name varchar(30) NOT NULL
, access_date datetime NOT NULL DEFAULT NOW()
, PRIMARY KEY (idx)
, UNIQUE KEY idx (name)
);

CREATE TABLE bbs (
  idx int(11) NOT NULL AUTO_INCREMENT
, username varchar(20) NOT NULL
, subject varchar(100) NOT NULL
, content varchar(200) 
, create_date datetime NOT NULL DEFAULT NOW()
, update_date datetime
, PRIMARY KEY (idx)
);

CREATE TABLE admin (
  idx INT(11) NOT NULL AUTO_INCREMENT
, subject VARCHAR(20) NOT NULL
, content VARCHAR(100) NOT NULL
, sent_date VARCHAR(14)
, received_date VARCHAR(14)
, read_yn CHAR(1)
, PRIMARY KEY(idx)
);



CREATE TABLE users(
  id bigint AUTO_INCREMENT not null primary key
, username VARCHAR(100) not null
, password VARCHAR(100) not null
, enabled boolean not null default true
, accountNonExpired boolean default true
, credentialsNonExpired boolean default true
, accountNonLocked boolean default true
);

CREATE TABLE roles(
  id bigint AUTO_INCREMENT NOT NULL PRIMARY KEY
, name VARCHAR(100) NOT NULL
);
 
CREATE TABLE permissions(
  id bigint AUTO_INCREMENT NOT NULL PRIMARY KEY
, name VARCHAR(100) NOT NULL
);
 
CREATE TABLE role_members(
  roles_id bigint NOT NULL
, members_id bigint NOT NULL
);

create table role_permissions(
  roles_id bigint NOT NULL
, permissions_id bigint NOT NULL
);


INSERT INTO users(username, password) VALUES ('scott', 'tiger');
INSERT INTO users(username, password) VALUES ('will', 'smith');
INSERT INTO users(username, password) VALUES ('steve', 'jobs');
INSERT INTO users(username, password) VALUES ('admin', 'admin');

INSERT INTO roles(name) VALUES ('ROLE_USER');
INSERT INTO roles(name) VALUES ('ROLE_ADMIN');

INSERT INTO permissions(name) VALUES ('READ');
INSERT INTO permissions(name) VALUES ('CREATE');
INSERT INTO permissions(name) VALUES ('UPDATE');
INSERT INTO permissions(name) VALUES ('DELETE');

INSERT INTO role_members(roles_id, members_id) VALUES (1, 1);
INSERT INTO role_members(roles_id, members_id) VALUES (1, 2);
INSERT INTO role_members(roles_id, members_id) VALUES (1, 3);
INSERT INTO role_members(roles_id, members_id) VALUES (1, 4);
INSERT INTO role_members(roles_id, members_id) VALUES (2, 4);

INSERT INTO role_permissions(roles_id, permissions_id) VALUES (1, 1);
