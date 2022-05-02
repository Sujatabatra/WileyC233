CREATE DEFINER=`root`@`localhost` PROCEDURE `empCountByDepartment`(
in deptt varchar(30),
out total int)
BEGIN
select count(*) into total from employee where department=deptt;
IF total>3 THEN
select 'Too Many Employees in department ';
ELSE
select 'Too Few Employees in department ';
END IF;
END

call empCountByDepartment('IT',@total);