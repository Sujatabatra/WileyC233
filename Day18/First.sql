-- DDL
create database wileyc233;
use wileyc233;
drop database wileyc233;

create table employee(
empId int primary key,
empName varchar(25),
designation varchar(30),
department varchar(30),
salary double);

create index empDeptt on employee(department);

create unique index empDesig on employee(designation);

drop index empDesig on employee;

drop index empDeptt on employee;

-- DML
insert into employee values(1,'AAAA','Executive','Sales',34000);

insert into employee(empId,empName,salary,designation,department)
values(2,'BBBB',75000,'Sr. Associate','IT');

-- DQL
select * from employee;

-- projection : selection of columns
select empId,empName,department,designation,salary
from employee;

select empId,empName
from employee;

-- selection : selection of rows
select *
from employee
where department='IT';

select empId,empName,department
from employee
where department='it';

create table dept(
id int primary key,
name varchar(25));


insert into employee(empId,empName,salary,designation,department)
values(3,'CCCC',55000,'Associate','IT'),
(4,'DDDD',150000,'Manager','HR'),
(5,'EEEE',85000,'Sr. Associate','HR');

insert ignore into employee(empId,empName,salary,designation,department)
values(6,'FFFF',15000,'Executive','IT'),
(7,'GGGG',50000,'Sr. Executive','Sales'),
(5,'HHHH',185000,'Manager','Sales');

