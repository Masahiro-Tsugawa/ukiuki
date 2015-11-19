drop database if exists sports_gym;

create database if not exists sports_gym;
use sports_gym;

/* user */
drop table if exists user;

create table if not exists user(
  id int not null auto_increment unique,
  email varchar(100) not null unique,
  password varchar(32) not null,
  name varchar(100) not null,
  tel_num varchar(13) not null,
  postal_code varchar(8) not null,
  address varchar(255) not null,
  unique_id varchar(50),
  oauth_name varchar(50),
  credit_token varchar(255),
  credit_num varchar(4),
  registered_date datetime not null,
  renew_date datetime not null,
  primary key (id)
);

insert into user(id,email,password,name,tel_num,postal_code,address,
  unique_id,credit_token,credit_num,registered_date,renew_date)
  values(1,"test@test.com","testtest","test","00-0000-0000","000-0000",
  "test","test","test","0000","0000/01/01 00:00:00","0001/01/01 00:00:00");
INSERT INTO user VALUES (2,"hidehiko202@dydrfgvpca.iol","XWchBiUd","中　英彦","0764060942","9220307","石川県加賀市干拓町2-16-1",null,null,null,"2014-09-01 12:00:00","2014-11-01 12:00:00");

/* ticket */
drop table if exists ticket;

create table if not exists ticket(
  id int not null auto_increment,
  name varchar(100) not null,
  price float not null,
  ticket_type varchar(25) not null,
  is_sale boolean not null,
  is_show boolean not null,
  registered_date datetime not null,
  renew_date datetime not null,
  primary key (id)
);

insert into ticket(id,name,price,ticket_type,is_sale,is_show,
  registered_date,renew_date)
  values(1,"test",100.0,"test",false,false,
    "0000/01/01 00:00:00","0001/01/01 00:00:00");
insert into ticket values(2,"フル",1600.0,"use",true,true,
"0000/01/01 00:00:00","0001/01/01 00:00:00");
insert into ticket values(3,"マシン",700.0,"use",true,true,
"0000/01/01 00:00:00","0001/01/01 00:00:00");
insert into ticket values(4,"プール",700.0,"use",true,true,
"0000/01/01 00:00:00","0001/01/01 00:00:00");
insert into ticket values(5,"風呂",700.0,"use",true,true,
"0000/01/01 00:00:00","0001/01/01 00:00:00");
insert into ticket values(6,"レンタル",500.0,"option",true,true,
"0000/01/01 00:00:00","0001/01/01 00:00:00");
insert into ticket values(7,"パーソナルトレーナー",5000.0,"option",true,true,
"0000/01/01 00:00:00","0001/01/01 00:00:00");

/* order */
drop table if exists `order`;

create table if not exists `order`(
  id int not null auto_increment,
  user_id int,
  foreign key(user_id) references user(id)
  on delete set null,
  registered_date datetime not null,
  primary key (id)
);

insert into `order`(id,user_id,registered_date)
  values(1,1,"0000/01/01 00:00:00");

/* order_ticket */
drop table if exists order_ticket;

create table if not exists order_ticket(
  order_id int not null,
  foreign key(order_id) references `order`(id)
  on update cascade,
  ticket_id int not null,
  foreign key(ticket_id) references ticket(id)
  on update cascade,
  sheets int not null,
  total_amount float not null,
  registered_date datetime not null
);

insert into order_ticket(order_id,ticket_id,sheets,total_amount,registered_date)
  values(1,1,10,1000.0,"0000/01/01 00:00:00");

/* admin */
drop table if exists admin;

create table if not exists admin(
  id int not null auto_increment,
  admin_password varchar(32) not null,
  admin_name varchar(32) not null,
  is_login boolean,
  registered_date datetime not null,
  primary key (id)
);

insert into admin(id,admin_password,admin_name,is_login,registered_date)
  values(1,"test","test",false,"0000/01/01 00:00:00");
