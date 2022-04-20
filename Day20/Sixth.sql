-- aggregate function : group function 

select sum(salary)
from employee;

select min(salary)
from employee;

select max(salary)
from employee;

select avg(salary)
from employee;

select count(salary)
from employee;

select * from employee;

select department,sum(salary) as "Total Salary", min(salary)
from employee
group by department;

select department,sum(salary) as "Total Salary"
from employee
where designation!='Associate' and department IS NOT null
group by department
having sum(salary)>150000
order by department;

select department,designation
from employee
where  department IS NOT null and designation!='Associate' ;