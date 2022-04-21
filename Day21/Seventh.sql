use wileyc233;
select * from employee;

insert ignore into emp(id,name,deptt,designation,salary)
select * from employee;

select * from emp;

create table project(
projectId varchar(4) primary key,
projectName varchar(25)
);

insert into project
values('P001','Project1'),
('P002','Project2'),
('P003','Project3'),
('P004','Project4'),
('P005','Project5');

create table Empl(
id int,
name varchar(25),
deptt varchar(30) ,
designation varchar(30),
salary double,
projectId varchar(4),
primary key(id),
foreign key(projectId) references project(projectId) ON DELETE CASCADE);

desc empl;

insert into empl
values(1,'AAAA','Sales','Manager',156000,'P002'),
(2,'BBBB','IT','Manager',156000,'P003'),
(3,'CCCC','HR','Manager',156000,'P001'),
(4,'DDDD','Sales','Manager',156000,'P002'),
(5,'EEEE','HR','Manager',156000,'P001'),
(6,'FFFF','IT','Manager',156000,'P005');

select * from empl;

select * from project;

delete from project 
where projectId='P002';

select * from project;