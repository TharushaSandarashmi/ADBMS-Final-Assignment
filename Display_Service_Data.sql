drop procedure if exists c_Customer_Table;
go

create procedure c_Customer_Table(@Service_Id INT)

AS 
BEGIN

select Customer_Id,Customer_Name,Quantity from Customer_Table
where Service_Id=@Service_Id;

END;

EXEC c_Customer_Table @Service_Id='004';

