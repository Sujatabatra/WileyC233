select * from employee;

CREATE DEFINER=`root`@`localhost` PROCEDURE `empCountByDepartment`(
in deptt varchar(30),
out total int)
BEGIN
select count(*) into total from employee where department=deptt;
END

call empCountByDepartment('Sales',@total);

select @total;