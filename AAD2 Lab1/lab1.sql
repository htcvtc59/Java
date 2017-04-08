create database c1108g
go
use c1108g
go
create table Persons(
	id int primary key identity(1,1),
		name varchar(90)
)
select t.*, CONVERT(varchar,getdate(),103) current_day from persons t
insert into Persons values('Luong');
insert into Persons values('Luong1');
insert into Persons values('Luong2');

