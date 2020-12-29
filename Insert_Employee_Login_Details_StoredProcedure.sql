
CREATE PROCEDURE employeeLoginDetails(
@loginid varchar(10),
@username varchar(50),
@password varchar(20),
@empid int)
AS
BEGIN
INSERT INTO Employee_Login_Table(Login_ID, Login_Username, Login_Password, Employee_ID)
VALUES (@loginid, @username, @password, @empid);
END;