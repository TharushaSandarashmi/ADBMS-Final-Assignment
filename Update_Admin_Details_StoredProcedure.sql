
CREATE PROCEDURE updateAdminDetails(
@name varchar(50),
@username varchar(50),
@password varchar(20)
)
AS
BEGIN
UPDATE Admin_Table SET Admin_Username=@username, Admin_Password=@password 
WHERE Admin_Name=@name;
END;