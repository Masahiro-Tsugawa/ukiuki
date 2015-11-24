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
  oauth_name varchar(15),
  credit_token varchar(255),
  credit_num varchar(4),
  registered_date datetime not null,
  renew_date datetime not null,
  primary key (id)
);

INSERT INTO user VALUES (1,"hidehiko202@dydrfgvpca.com","XWchBiUd","中　英彦","07-6406-0942","922-0307","石川県加賀市干拓町2-16-1",null,null,null,null,"2015/09/01 12:00:00","2015/11/01 12:00:00");
INSERT INTO user VALUES (2,"soratsuruta@rvwac.co.jp","VvPdcVjl","鶴田　空","463-319-2048","244-0806","神奈川県横浜市戸塚区上品濃4-9",null,null,null,null,"2015/09/02 12:00:00","2015/11/02 12:00:00");
INSERT INTO user VALUES (3,"vz=tmbwrm=zcg-vkazuto376@jfgm.ne.jp","A2DcygAw","河野　和人","8411808040","722-1201","広島県世羅郡世羅町戸張1-4-3",null,null,null,null,"2015/09/03 12:00:00","2015/11/03 12:00:00");
INSERT INTO user VALUES (4,"qbjhyjontrinka677@jfftsf.com","n7KXShHE","牧野　凛香","773-283-6743","620-0947","京都府福知山市旭が丘4-14",null,null,null,null,"2015/09/03 15:00:00","2015/11/03 15:00:00");
INSERT INTO user VALUES (5,"Ayana_Mizukami@lwbjtf.co.jp","wTJFuCvn","水上　絢菜","98-2355-4314","882-0003","宮崎県延岡市稲葉崎町3-12テラス稲葉崎町104",null,null,null,null,"2015/09/05 12:00:00","2015/11/05 12:00:00");
INSERT INTO user VALUES (6,"vrftrqucu-opkfwyasuko952@xgxmxhuh.ne.jp","GX3gSqai","杉山　泰子","993-352-4892","894-0015","鹿児島県奄美市名瀬真名津町2-4",null,null,null,null,"2015/09/10 12:00:00","2015/11/10 12:00:00");
INSERT INTO user VALUES (7,"yoshihiko4313@pnkco.com","gGzasXOo","松浦　芳彦","5857-37-7933","501-2805","岐阜県関市洞戸尾倉3-18-14洞戸尾倉ドリーム416",null,null,null,null,"2015/09/12 12:00:00","2015/11/12 12:00:00");
INSERT INTO user VALUES (8,"yoshiaki2129@wlzeem.co.jp","SdwBIED9","宮内　義昭","85-3851-3628","753-0088","山口県山口市中河原2-1-13",null,null,"328C5022CCC950D0BC9CE3E3F752CC0B9363AB949D46C63DDC4C95FF2D2F2609","1133","2015/09/21 12:00:00","2015/11/21 12:00:00");
INSERT INTO user VALUES (9,"kikuo086@mwvrdxkjxt.ne.jp","Lw7OriGO","大村　菊男","027-270-9051","370-2301","群馬県富岡市桑原1-7-3",null,null,null,null,"2015/09/22 12:00:00","2015/11/22 12:00:00");
INSERT INTO user VALUES (10,"ikimoto@surnlio.com","iyOT8VLl","木本　忠良","568-8082-840","479-0016","愛知県常滑市高坂2-2-7",null,null,"BFB1D1AF954E6B07D1D7A17DF3E8F305FEA11155A0DA98610DA39EF3CCC5A8E0","5643","2015/10/02 12:00:00","2015/11/02 12:00:00");
INSERT INTO user VALUES (11,"masumiichikawa@srul.co.jp","bG2MT6vP","市川　真澄","88-4178-2678","789-0168","高知県長岡郡大豊町立野4-17-9",null,null,null,null,"2015/10/04 12:00:00","2015/11/04 12:00:00");
INSERT INTO user VALUES (12,"chouhei199@lqifrllg.ne.jp","wVI4c3lc","飯塚　長平","950-458-9259","841-0045","佐賀県鳥栖市安楽寺町3-16-4",null,null,null,null,"2015/10/07 12:00:00","2015/11/07 12:00:00");
INSERT INTO user VALUES (13,"ks=kiai-lhrfsutoshiaki108@lfmtwazt.com","gmSUI2ui","金子　俊章","62-6900-0925","560-0041","大阪府豊中市清風荘3-19",null,null,"4D46044EE7AFDD2EE36799B297FCC3C5652AFF56DCA0F42DC880BD213CA55591C","2287","2015/10/14 12:00:00","2015/11/14 12:00:00");
INSERT INTO user VALUES (14,"Ayaka_Matsuzaki@mumydonus.co.jp","HYweTohg","松崎　綾華","7206-301-377","574-0033","大阪府大東市扇町3-2-15",null,null,null,null,"2015/10/15 12:00:00","2015/11/15 12:00:00");
INSERT INTO user VALUES (15,"yayoi41382@dxikfoczhf.ne.jp","CbeKi2ua","福島　弥生","95-2037-2277","848-0027","佐賀県伊万里市立花町4-14-17",null,null,null,null,"2015/10/16 12:00:00","2015/11/16 12:00:00");
INSERT INTO user VALUES (16,"eijimasuda@ttkvcq.com","2uZA5cWi","増田　栄二","970-159-5438","870-1123","大分県大分市寒田2-14-4コート寒田319",null,null,"D06F42AA0C5C4AF8CC499E9FBB408F28C195774DD85370C0790F246ADEA67B39","3795","2015/10/20 12:00:00","2015/11/20 12:00:00");
INSERT INTO user VALUES (17,"ginzou11232@nounxzos.co.jp","9IyQHNtq","大井　銀蔵","05-4208-2720","436-0334","静岡県掛川市孕石1-16シティ孕石300",null,null,null,null,"2015/10/23 12:00:00","2015/11/23 12:00:00");
INSERT INTO user VALUES (18,"esbjlbemiwao23281@nfdtmf.ne.jp","nsYwkrBO","川崎　岩夫","276-016-3090","370-0024","群馬県高崎市八幡原町1-2-15ハイツ八幡原町102",null,null,null,null,"2015/10/25 12:00:00","2015/12/25 12:00:00");
INSERT INTO user VALUES (19,"apmgyrrrp=jfpmitsuaki823@bgjp.com","CXABNQwh","奈良　光昭","114-6902-788","090-0051","北海道北見市高栄東町4-5-19",null,null,null,null,"2015/10/28 12:00:00","2015/12/28 12:00:00");
INSERT INTO user VALUES (20,"takashi_akasaka@osdrpm.co.jp","8WqvyQwo","赤坂　卓","99-4800-8209","891-6154","鹿児島県大島郡喜界町白水2-4-1",null,null,null,null,"2015/10/29 12:00:00","2015/12/29 12:00:00");
INSERT INTO user VALUES (21,"tateaki11554@dhrqfwidb.ne.jp","YS04qAzz","榊原　賢明","073-550-2932","643-0602","和歌山県有田郡有田川町杉野原3-12キャッスル杉野原412",null,null,null,null,"2015/11/06 12:00:00","2015/12/06 12:00:00");
INSERT INTO user VALUES (22,"Sachiko_Uchimura@ckdyysm.com","zFJJlIgr","内村　幸子","805-8614-463","683-0364","鳥取県西伯郡南部町絹屋1-8-18絹屋プラチナ406",null,null,null,null,"2015/11/08 12:00:00","2015/12/08 12:00:00");
INSERT INTO user VALUES (23,"yumiko_egashira@ewwflo.co.jp","XQZ6f0Xj","江頭　弓子","7062-851-405","929-0432","石川県河北郡津幡町北横根3-14-1ザ北横根318",null,null,null,null,"2015/11/09 12:00:00","2015/12/09 12:00:00");
INSERT INTO user VALUES (24,"kenji59106@cktpddbtd.ne.jp","3KoN97XP","手島　健二","90-5377-9098","851-3504","長崎県西海市西海町木場郷1-2-14西海町木場郷コーポ204",null,null,null,null,"2015/11/11 12:00:00","2015/12/11 12:00:00");
INSERT INTO user VALUES (25,"iojima@taqortyttl.com","hHdgAJ7N","小嶋　敬一","554-007-2942","419-0115","静岡県田方郡函南町新田4-13-2リバーサイド新田102",null,null,null,null,"2015/11/13 12:00:00","2015/12/13 12:00:00");
INSERT INTO user VALUES (26,"akira0894@rsed.co.jp","RhrBSvbW","平尾　晶","20-3213-4540","999-3722","山形県東根市泉郷4-10-17泉郷ダイヤモンド416",null,null,null,null,"2015/11/17 12:00:00","2015/12/17 12:00:00");
INSERT INTO user VALUES (27,"youko7746@glkszkvooe.ne.jp","PjIejJ9K","金井　容子","769-085-1613","939-0245","富山県射水市棚田3-14-1",null,null,null,null,"2015/11/18 12:00:00","2015/12/18 12:00:00");
INSERT INTO user VALUES (28,"hatsue_takefuji@wwhkiha.com","2vp5TPQa","武藤　初江","2880-44-9679","329-0418","栃木県下野市紫2-10",null,null,"0CBB82BC1016A8934B8FD188B4537C0E02053D89DC9CD6950D85D5D7C71279B4","6187","2015/11/19 12:00:00","2015/12/19 12:00:00");
INSERT INTO user VALUES (29,"Isao_Asano@guxpb.co.jp","R7tCEoR1","浅野　勲","242-067-1230","963-4313","福島県田村市船引町石森1-9船引町石森ドリーム305",null,null,null,null,"2015/11/24 12:00:00","2015/01/24 12:00:00");
INSERT INTO user VALUES (30,"ildmgwpmzpcnobaoi1316@sszqifnk.ne.jp","IGfd1Usq","古市　蒼依","04-4888-7703","257-0015","神奈川県秦野市平沢4-7-20プレシャス平沢417",null,null,null,null,"2015/11/26 12:00:00","2015/01/26 12:00:00");

insert into user(id,email,password,name,tel_num,postal_code,address,
  unique_id,credit_token,credit_num,registered_date,renew_date)
  values(31,"test@test.com","testtest","test","00-0000-0000","000-0000",
  "test","test","test","0000","0000/01/01 00:00:00","0001/01/01 00:00:00");

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
  values(1,31,"0000/01/01 00:00:00");

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

INSERT INTO admin VALUES (1, "admin1", "admin1", false, "2015/11/01 12:00:00");
INSERT INTO admin VALUES (2, "admin2", "admin2", false, "2015/11/02 12:00:00");
INSERT INTO admin VALUES (3, "admin3", "admin3", false, "2015/11/03 12:00:00");
INSERT INTO admin VALUES (4, "admin4", "admin4", false, "2015/11/04 12:00:00");
INSERT INTO admin VALUES (5, "admin5", "admin5", false, "2015/11/05 12:00:00");
INSERT INTO admin VALUES (6, "admin6", "admin6", false, "2015/11/06 12:00:00");
INSERT INTO admin VALUES (7, "admin7", "admin7", false, "2015/11/07 12:00:00");
INSERT INTO admin VALUES (8, "admin8", "admin8", false, "2015/11/08 12:00:00");
INSERT INTO admin VALUES (9, "admin9", "admin9", false, "2015/11/09 12:00:00");
INSERT INTO admin VALUES (10, "admin10", "admin10", false, "2015/11/10 12:00:00");
insert into admin(id,admin_password,admin_name,is_login,registered_date)
  values(11,"test","test",false,"0000/01/01 00:00:00");
