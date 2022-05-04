select * from employee;

BEGIN
declare totalRecords int;
-- declare exit handler for 1062
declare continue handler for 1062
begin
select concat('Duplicate Key', eId,' occured') as Message;
end;

insert into employee values(eId,eName,desig,deptt,sal);

select count(*) into totalRecords from employee;
select totalRecords;
END

call insertEmployee(18,'RRRRRR','Sr. Manager','IT',360000);
call insertEmployee(14,'XYZ','Manager','Sales',23000);