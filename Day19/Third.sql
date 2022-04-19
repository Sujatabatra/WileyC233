use wileyc233;

select * from employee;

SET sql_safe_updates=0;

update employee
set salary=salary+1000
where department='HR';

delete from employee
where empId=8;