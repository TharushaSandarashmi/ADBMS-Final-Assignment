create procedure updateCustomerTableData(
@Customer_Id int,
@Customer_Name varchar(50),
@Quantity int,
@Customer_Address varchar(50),
@TelNo int,
@Service_Id int
)
AS
BEGIN

update Customer_Table set @Customer_Name=@Customer_Name,Quantity=@Quantity,
Customer_Address=@Customer_Address,TelNo=@TelNo,Service_Id=@Service_Id 

where
Customer_Id=@Customer_Id;

END


