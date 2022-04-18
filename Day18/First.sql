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