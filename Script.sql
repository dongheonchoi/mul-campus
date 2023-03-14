create table member (
	id varchar(100) primary key,
	pw varchar(100),
	name varchar(100),
	tel varchar(100)
)

create table bbs (
	no int(10) primary key ,
	title varchar(100),
	content varchar(100),
	writer varchar(100)
)

drop table bbs

insert into member values ('apple3','apple3','apple3','apple3')

select * from member