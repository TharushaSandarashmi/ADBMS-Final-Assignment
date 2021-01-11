CREATE TRIGGER deleteDependentDetails
ON Employee_Table
After DELETE 
AS
BEGIN
delete from Dependent_Table where NOT EXISTS(select Employee_ID from Employee_Login_Table);
END;