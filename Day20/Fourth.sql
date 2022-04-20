use wileyc233;

-- Projection : expressions as well

select * from employee; 

select *,(salary+100)*12 "Incremented Annual Salary"
from employee;

select *,(salary+100)*12 'Incremented Annual Salary'
from employee;

select *,(salary+100)*12 as 'Incremented Annual Salary'
from employee;

select *,(salary+100)*12 as IncrementedAnnualSalary
from employee;


select empId,empName,salary,
salary*.15 HR,
salary*.12 PF, 
salary*.18 as DA,
salary+salary*.15+salary*.18-salary*.12 as "Total Salary"
from employee
where salary*.15>10000;

select empId,empName,salary*12
from employee;

insert into employee
values(9,'IIII','Associate','HR',null);

select * from employee LIMIT 4;

select * from employee LIMIT 2,3;

select * from employee
order by department desc;

-- relational Operator : >, <, >=, <=, !=, =, IS, IS NOT (Selection)

select * 
from employee
where department='Sales';

select * 
from employee
where salary > 30000;

select * 
from employee
where salary < 30000;

select * 
from employee
where department!="Sales";

insert into employee
values(14,'NNNN','Sr. Associate',null,18000),
(15,'OOOO',null,null,16000);

select * from employee;

select * from employee
where department IS null;

select * from employee
where department IS NOT null;

select DISTINCT department
from employee
order by department;

select DISTINCT department,designation,salary
from employee
order by department; 