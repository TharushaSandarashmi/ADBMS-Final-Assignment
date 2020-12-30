
CREATE PROCEDURE adminDetails(
@name varchar(50),
@username varchar(50),
@password varchar(20))
AS
BEGIN
INSERT INTO Admin_Table(Admin_Name, Admin_Username, Admin_Password)
VALUES (@name, @username, @password);
END;