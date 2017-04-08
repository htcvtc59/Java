create database Demojdbc
go
use Demojdbc
go
create table Student(
id int identity primary key,
name varchar(50),
address varchar(70),
age int 
)

create proc FindStd @name varchar(50)
as
begin
select * from Student where [name] like @name

end
exec FindStd '%A%'

select * from Student
insert into Student values('MR.2','ND',23)