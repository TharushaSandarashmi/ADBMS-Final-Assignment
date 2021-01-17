create procedure DeleteCustomerData
(
@Customer_Id int,
@Customer_Name varchar(50),
@Quantity int,
@Customer_Address varchar(50),
@TelNo int,
@Service_Id int
)

AS
BEGIN

delete from Customer_Table
where @Service_Id=@Service_Id

END;

EXEC DeleteCustomerData @Customer_Id,@Customer_Name,@Quantity,@Customer_Address,@TelNo,@Service_Id;

