CREATE FUNCTION getNoOfDesignation(@designation varchar(30))
RETURNS int
AS
BEGIN
DECLARE @des int;
select @des=COUNT(*) from Employee_Table where Designation=@designation;
return @des;
END;

select dbo.getNoOfDesignation('Employee') as no_of_designation

