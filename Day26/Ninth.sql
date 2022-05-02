use wileyc233;

DELIMITER $$;

CREATE PROCEDURE getEmployeeDetails()
BEGIN
  select empId,empName from employee;   
END$$;

DELIMITER ;
call getEmployeeDetails();

call getDepartmentWiseEmployeeCount();

call getTotalSalary();

drop procedure getEmployeeDetails;

select * from employee;

call getSalaryDetails(4);