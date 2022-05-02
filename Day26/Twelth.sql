CREATE PROCEDURE `demoInOut`(inout counter int,
in incrementValue int)
BEGIN
set counter=counter+incrementValue;
END
set @counter=10;
call demoInOut(@counter,2);

select @counter;