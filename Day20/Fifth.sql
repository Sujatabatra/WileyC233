-- Logical Operator : AND , OR, NOT

select * 
from employee 
where salary>=10000 and salary<=50000;

select * 
from employee 
where salary BETWEEN 10000 and 50000;
 
 select *
 from employee
 where department="IT" and designation="Associate";
 
 select * 
 from employee
 where designation="Associate" or designation="Manager";
 
 select * 
 from employee
 where designation IN("Associate","Manager");
 
 select *
 from employee
 where department="IT" or designation="Associate";
 
 -- LIKE : _ = 1 character ,% = 0 or more characters
 
 select * 
 from employee
 where designation LIKE 'Sr.%';
 
 select * 
 from employee
 where designation NOT LIKE 'Sr.%';
 
 select *
 from employee
 where designation LIKE '%e';
 
 select *
 from employee
 where designation LIKE '________e';