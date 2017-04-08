create database login_sample;

use login_sample;

create table account(
	username varchar(20) primary key,
	password varchar(50) not null,
	full_name nvarchar(250) not null,
	phone_number varchar(20),
	birth_date datetime
)

insert into account values('yvi','matkhau',N'Vu Thi Y Vi','099999999','1999/09/09 09:09:000');