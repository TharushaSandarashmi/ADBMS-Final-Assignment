

CREATE PROCEDURE updateEmployeeLoginDetails(
@loginid varchar(10),
@username varchar(50),
@password varchar(20),
@empid int)
AS
BEGIN
UPDATE Employee_Login_Table SET Login_ID=@loginid, Login_Username=@username, Login_Password=@password, Employee_ID=@empid 
WHERE Login_ID=@loginid;
END;

EXEC updateEmployeeLoginDetails  'L004','Dikson','Dikson008','2';

EXEC updateEmployeeLoginDetails 'L003','Prasadi','Prasadi003','5';

