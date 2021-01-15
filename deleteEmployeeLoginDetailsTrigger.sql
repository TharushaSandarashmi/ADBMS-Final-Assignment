
CREATE TRIGGER deleteEmployeeLoginDetails
ON Employee_Table
After DELETE 
AS
BEGIN
delete from Employee_Login_Table where NOT EXISTS(select Employee_ID from Employee_Table);
END;