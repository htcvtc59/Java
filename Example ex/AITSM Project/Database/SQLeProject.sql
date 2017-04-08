
go
create database eProjectC1209G3G2
go
go
use eProjectC1209G3G2
go
go
create table admin
(
UserName varchar(20) primary key,
Password  varchar(50),
status int default(1),
)
go



go
create table Staff
(
ID varchar(20) primary key,
password varchar(50),
Name varchar(50),
Sex  varchar(10),
Phonenumber varchar(30),
Email varchar(50),
Experience varchar(50),
status int default(1),


)

Create table Subject 
(
     ID varchar(30) primary key,
     
StaffID varchar(20) foreign key references Staff(ID) ,
	 status int default(1),
) 
go
go 
create table Courses
(
ID varchar(10) primary key,
Name varchar(50),
Info varchar(50),
Subject1ID varchar(30) foreign key references Subject(ID) ,

Subject2ID varchar(30) foreign key references Subject(ID),

Subject3ID varchar(30) foreign key references Subject(ID) ,

Subject4ID varchar(30) foreign key references Subject(ID),
status int default(1),
)
go
go
create table Class
(
ID varchar(10),
CourseID varchar(10)  foreign key references Courses(ID),
status int default(1),
primary key(ID)
)
go
 go                                            
create table Student
(
id varchar(10) primary key,
name varchar(50), 
email varchar(100),
address varchar(50),
sex varchar(50),
age int,
classID varchar(10) foreign key references Class(ID),
status int default(1),

S1_Subject1 int default(0),
S2_Subject1 int default(0),
S3_Subject1 int default(0),
S4_Subject1 int default(0),
S5_Subject1 int default(0),
S6_Subject1 int default(0),
S7_Subject1 int default(0),
S8_Subject1 int default(0),
S9_Subject1 int default(0),
S10_Subject1 int default(0),

S1_Subject2 int default(0),
S2_Subject2 int default(0),
S3_Subject2 int default(0),
S4_Subject2 int default(0),
S5_Subject2 int default(0),
S6_Subject2 int default(0),
S7_Subject2 int default(0),
S8_Subject2 int default(0),
S9_Subject2 int default(0),
S10_Subject2 int default(0),

S1_Subject3 int default(0),
S2_Subject3 int default(0),
S3_Subject3 int default(0),
S4_Subject3 int default(0),
S5_Subject3 int default(0),
S6_Subject3 int default(0),
S7_Subject3 int default(0),
S8_Subject3 int default(0),
S9_Subject3 int default(0),
S10_Subject3 int default(0),

S1_Subject4 int default(0),
S2_Subject4 int default(0),
S3_Subject4 int default(0),
S4_Subject4 int default(0),
S5_Subject4 int default(0),
S6_Subject4 int default(0),
S7_Subject4 int default(0),
S8_Subject4 int default(0),
S9_Subject4 int default(0),
S10_Subject4 int default(0),
)
go
go
create table Time_Table
(
ClassID varchar(10) primary key  foreign key references Class(ID) ,
Mo_slot1 varchar(30)  foreign key references Subject(ID) ,
Mo_slot2 varchar(30)  foreign key references Subject(ID) ,
Mo_slot3 varchar(30)  foreign key references Subject(ID) ,
Mo_slot4 varchar(30)  foreign key references Subject(ID) ,

Tu_slot1 varchar(30)  foreign key references Subject(ID) ,
Tu_slot2 varchar(30)  foreign key references Subject(ID) ,
Tu_slot3 varchar(30)  foreign key references Subject(ID) ,
Tu_slot4 varchar(30)  foreign key references Subject(ID) ,

We_slot1 varchar(30)  foreign key references Subject(ID) ,
We_slot2 varchar(30)  foreign key references Subject(ID) ,
We_slot3 varchar(30)  foreign key references Subject(ID) ,
We_slot4 varchar(30)  foreign key references Subject(ID) ,

Th_slot1 varchar(30)  foreign key references Subject(ID) ,
Th_slot2 varchar(30)  foreign key references Subject(ID) ,
Th_slot3 varchar(30)  foreign key references Subject(ID) ,
Th_slot4 varchar(30)  foreign key references Subject(ID) ,

Fr_slot1 varchar(30)  foreign key references Subject(ID) ,
Fr_slot2 varchar(30)  foreign key references Subject(ID) ,
Fr_slot3 varchar(30)  foreign key references Subject(ID),
Fr_slot4 varchar(30)  foreign key references Subject(ID) ,

Sa_slot1 varchar(30)  foreign key references Subject(ID) ,
Sa_slot2 varchar(30)  foreign key references Subject(ID) ,
Sa_slot3 varchar(30)  foreign key references Subject(ID) ,
Sa_slot4 varchar(30)  foreign key references Subject(ID), 
status int default(1),


)
go
go
insert into admin values('admin','123456',1)
insert into admin values('demo','123456',1)

insert into Staff values('sa001','123456','Staff1','Male','013242523','Staff1@gmail.com','5 year',1)
insert into Staff values('sa002','123456','Staff2','Male','013242523','Staff2@gmail.com','5 year',1)
insert into Staff values('sa003','123456','Staff3','Male','013242523','Staff3@gmail.com','5 year',1)
insert into Staff values('sa004','123456','Staff4','Male','013242523','Staff4@gmail.com','5 year',1)




insert into Subject values('Java','sa001',1)
insert into Subject values('C#','sa002',1)
insert into Subject values('.Net','sa003',1)
insert into Subject values('Android','sa001',1)
insert into Subject values('IOS','sa004',1)
insert into Subject values('SQL','sa002',1)
insert into Subject values('HTML','sa003',1)

insert into Courses values('co01','Course 1','Android & Java Application Programming','Java','Android','SQL','HTML',1)
insert into Courses values('co02','Course 2','IOS & .Net Application Programming','C#','IOS','.Net','HTML',1)

insert into Class values('cl001','co01',1)

insert into Time_Table (ClassID,Mo_slot1,Mo_slot2,We_slot1,We_slot2,Fr_slot1,Fr_slot2) values('cl001','Java','Android','Java','Android','SQL','HTML')

insert into Student (id,name,email,address,sex,age,classID) values('st001','Vip','vip@fpt.vn','Tokyo','Male',18,'cl001')
insert into Student (id,name,email,address,sex,age,classID) values('st002','devjl','devjl@fpt.vn','Washington DC','Male',19,'cl001')
insert into Student (id,name,email,address,sex,age,classID) values('st003','king','king@fpt.vn','Hokaido','Male',21,'cl001')
insert into Student (id,name,email,address,sex,age,classID) values('st004','candy','candy@fpt.vn','Hunsicodo','Male',23,'cl001')
insert into Student (id,name,email,address,sex,age,classID) values('st005','lili','lili@fpt.vn','Ha Noi','Male',18,'cl001')
insert into Student (id,name,email,address,sex,age,classID) values('st006','kenvjl','kenvil@fpt.vn','Ho Chi Minh','Male',18,'cl001')
insert into Student (id,name,email,address,sex,age,classID) values('st007','susu','susu@fpt.vn','New York','Male',19,'cl001')
insert into Student (id,name,email,address,sex,age,classID) values('st008','tomato','tomato@fpt.vn','Cairo','Male',18,'cl001')
insert into Student (id,name,email,address,sex,age,classID) values('st009','hokomono','hoko@fpt.vn','Moscow','Male',18,'cl001')
insert into Student (id,name,email,address,sex,age,classID) values('st011','kukukka','kukukp@fpt.vn','Hongkong','Male',19,'cl001')
insert into Student (id,name,email,address,sex,age,classID) values('st012','linda','linda@fpt.vn','Bejing','Male',18,'cl001')
insert into Student (id,name,email,address,sex,age,classID) values('st013','zombie','zombie@fpt.vn','Zhu hai','Male',18,'cl001')
go

