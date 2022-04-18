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