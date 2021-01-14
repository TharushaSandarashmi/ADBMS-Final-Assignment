CREATE FUNCTION getNoOfEmployees()
RETURNS int
AS
BEGIN
DECLARE @emp int;
select @emp=COUNT(*) from Employee_Table;
return @emp;
END;

select dbo.getNoOfEmployees() as no_of_employee