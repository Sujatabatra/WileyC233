use wileyc233;
select * from employeejpa;

DELIMITER //  

create trigger before_insert_empsalary   
BEFORE INSERT ON employee FOR EACH ROW  
BEGIN  
IF NEW.salary < 0 THEN SET NEW.salary = 0;  
END IF;  
END //  

select * from employee;

insert into employee values(18,'RRRRRR','Sr. Executive','IT',-30000);