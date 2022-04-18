create table ITEmployees(
id int primary key,
name varchar(25),
deptt varchar(30),
designation varchar(30),
salary double);

insert into ITEmployees(id,name,deptt,designation,salary)
select empId,empname,department,designation,salary
from employee
where department='IT';

select * from ITEmployees;

desc itemployees;

insert into itemployees
values(1,'AAAAA',null,'Associate',56000);

insert into ITEmployees(id,name,deptt,salary)
values(4,'DDDDD','IT',23000);

create table SalesEmployees(
id int primary key,
name varchar(25) not null,
deptt varchar(30) not null,
designation varchar(30),
salary double);

desc salesemployees;

insert into salesemployees
values(1,'AAAAA',null,'Associate',56000);

create table Emp(
id int primary key,
name varchar(25) not null unique,
deptt varchar(30) not null,
designation varchar(30),
salary double);

desc emp;

create table HrEmployees(
id int primary key,
name varchar(25) not null unique,
deptt varchar(30) default 'HR',
designation varchar(30),
salary double);

desc hremployees;

insert into hremployees(id,name,designation,salary)
values(1,'AAAA','Associate',23000);

select * from hremployees;

insert into emp
values(1,'AAAA','Sales','Associate',56000);

insert into emp
values(2,'BBBB','HR','Sr. Associate',68000);

select * from emp;

insert into emp
values(3,'BBBB','IT','Manager',68000);
