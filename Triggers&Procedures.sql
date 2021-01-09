use BookShopDB;

CREATE PROCEDURE show_ServiceData(@Service_Id int )
;
BEGIN
select * from Service AS S 
LEFT OUTER JOIN 
Employee AS E ON S.Employee_Id = E.Employee_Id 
where Service_Id =@Service_Id;
END;

EXEC show_ServiceData 003;


CREATE PROCEDURE show_EmployeeService(@Employee_Id int )
AS
BEGIN
select * from Service AS S 
RIGHT OUTER JOIN 
Employee AS E ON S.Employee_Id = E.Employee_Id 
where E.Employee_Id = @Employee_Id;
END;

EXEC show_EmployeeService 6;


create PROCEDURE insert_DVDdetails(@DVD_Id varchar(8),@DVD_Name varchar(50),@Unit_Price money,@No_of_Copies int)
 As
 BEGIN
 insert into DVD_Details(DVD_Id ,DVD_Name,Unit_Price,No_of_Copies) values(@DVD_Id,@DVD_Name,@Unit_Price,@No_of_Copies);
 END;


 create PROCEDURE insert_ServiceDetails(@Service_Id int,@Service_Name varchar(50),@Unit_Price money,@Employee_Id int)
 As
 BEGIN
 insert into DVD_Details(DVD_Id ,DVD_Name,Unit_Price,No_of_Copies) values(@Service_Id,@Service_Name,@Unit_Price,@Employee_Id);
 END;


 create PROCEDURE insert_DependentDetails(@Dependent_Id Varchar(6),@Dependent_Name varchar(50),@Relationship varchar(15),@Dependent_DOB date,@Telephone_No int,@Employee_Id int)
 As
BEGIN
 insert into Dependent(Dependent_Id ,Dependent_Name,Relationship,Dependent_DOB,Telephone_No,Employee_Id) values(@Dependent_Id,@Dependent_Name,@Relationship,@Dependent_DOB,@Telephone_No,@Employee_Id);
 END;


 CREATE PROCEDURE markAsReturned(@Recipt_Id int )
AS
BEGIN
update DVD_Rental set Status = 'Returned' Where Recipt_Id =@Recipt_Id;
END;

EXEC markAsReturned 10101;


create PROCEDURE updateServicePrice(@Service_Id int,@newUnit_Price money)
 As
 BEGIN
 update Service set Unit_Price = @newUnit_Price where Service_Id = @Service_Id;
 END;


 create PROCEDURE updateDVDPrice(@DVD_Id varchar(10),@newUnit_Price money,@newCopies int)
 As
 BEGIN
 update DVD_Details set Unit_Price = @newUnit_Price where DVD_Id = @DVD_Id;
 update  DVD_Details set No_of_Copies = @newCopies where DVD_Id = @DVD_Id;
 END;


 create PROCEDURE updateDependent(@Dependent_Id varchar(10),@Dependent_Name varchar(50),@Relationship varchar(15),@Dependent_DOB date,@Telephone_No int)
 As
 BEGIN
 update Dependent set Dependent_Name=@Dependent_Name,
 Relationship=@Relationship,
 Dependent_DOB=@Dependent_DOB,
 Telephone_No=@Telephone_No 
 where Dependent_Id = @Dependent_Id;
 END;


 CREATE FUNCTION calculateTotalPrice(@ReciptNo int,@DVD_Id varchar(10))
RETURNS money
AS
BEGIN
DECLARE @total money;
DECLARE @copies int;
DECLARE @unitprice money;
select @copies= No_of_DVD from DVD_Rental where Recipt_Id=@ReciptNo;
select @unitprice = Unit_Price from DVD_Details where DVD_Id=@DVD_Id;
select @total =  @copies * @unitprice 
RETURN @total;
END;

select dbo.calculateTotalPrice(10112,'MD0001') Total_Price;


CREATE TRIGGER  assign_Newemployee ON dbo.Employee 
AFTER DELETE 
AS
BEGIN
update Service set Employee_Id = NULL WHERE
Service.Employee_Id NOT IN (select Employee_Id from Employee);
END;
