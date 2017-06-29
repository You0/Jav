
#电影库
#所有电影都存放在这个表中
#type字段让其存入的时候就自动分词
CREATE TABLE movie(
	id int PRIMARY KEY AUTO_INCREMENT NOT NULL,
	title text NOT NULL,
	type varchar(100) NOT NULL,
	rating int NOT null,
	actor varchar(100) NOT NULL,
	cover text NOT NULL,
	imgs text NOT NULL,
	video text NOT NULL,
	fh varchar(100) NOT NULL,
	title_fc text NOT NULL,
	c_date date NOT NULL,
	UNIQUE KEY u_fh(fh)
)ENGINE=MyISAM CHARSET=utf8;



