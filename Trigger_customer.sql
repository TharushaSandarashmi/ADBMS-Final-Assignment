CREATE TRIGGER  Customer_for_Service ON Customer_Table
AFTER INSERT 
AS
BEGIN
Insert into Customer_Table Values (637823,'Tharusha',1,'223,fdf',078268268,007);


END;
GO

create view vw_roles
As
(
Select * from Customer_Table where Service_Id=007
);