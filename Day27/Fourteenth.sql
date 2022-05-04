use wileyc233;
-- declare cursor >> open cursor >> fetch value(till empty) >> close cursor
CREATE DEFINER=`root`@`localhost` PROCEDURE `getEmployeeNames`(inout name varchar(256))
BEGIN
-- declare variables
declare ename varchar(25);
declare finished int default 0;

-- declare cursor
declare curEmpName
cursor for
select empName from employee;

-- declare not found handler
declare continue handler for NOT FOUND SET finished=1;

-- open cursor
open curEmpName;

-- fetch ( till empty)
getENames: loop
fetch curEmpName into ename;
if finished=1 then  -- till empty
 leave getENames;
 end if;
 set name=concat(ename,";",name);
 end loop getENames;
 
 -- close cursor
 close curEmpName;
 
END
set @name="";
call getEmployeeNames(@name);
select @name;