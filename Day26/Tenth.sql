CREATE PROCEDURE `getSalaryDetails`(id int)
BEGIN
declare hr double;
declare sal double;
declare pf double;
declare totalSalary double;
select salary,.15*salary,.12*salary into sal,hr,pf from employee where empId=id;
set totalSalary=sal+hr-pf;
select sal,hr,pf,totalSalary;
END

call getSalaryDetails(4);