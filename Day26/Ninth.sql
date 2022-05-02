use wileyc233;

DELIMITER $$;

CREATE PROCEDURE getEmployeeDetails()
BEGIN
  select empId,empName from employee;   
END$$;

DELIMITER ;
call getEmployeeDetails();
CREATE PROCEDURE `getDepartmentWiseEmployeeCount`()
BEGIN
    select department,count(*) from employee where department is not null group by department;
END
call getDepartmentWiseEmployeeCount();

CREATE PROCEDURE `getTotalSalary`()
BEGIN
   declare totalSalary int;
   select sum(salary) into totalSalary from employee;
   select totalSalary;
END
call getTotalSalary();