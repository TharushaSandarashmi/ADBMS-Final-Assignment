create procedure updateSupplierTableData(
@Supplier_Id int,
@Supplier_Name varchar(40),
@Supplier_ContactNo int,
@Supplier_Address varchar(50),
@Supply_Date varchar(30)
)
AS
BEGIN

update  Supplier_Table set @Supplier_Name=@Supplier_Name,@Supplier_ContactNo=@Supplier_ContactNo,
Supplier_Address=@Supplier_Address,Supply_Date=@Supply_Date

where
Supplier_Id=@Supplier_Id;

END

EXEC updateSupplierTableData  '213124','Tharusha','0571714517','556/3,colombo','2021-01-15';


