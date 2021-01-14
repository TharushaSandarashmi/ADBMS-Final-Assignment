CREATE PROCEDURE changeDesignation(@empid int,@designation varchar(30))
AS
BEGIN
update Employee_Table set Designation=@designation where Employee_ID=@empid;
END;