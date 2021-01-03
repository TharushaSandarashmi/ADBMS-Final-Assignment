use BookShopDB;

CREATE FUNCTION findMonthRentalIncome(@month DATETIME)
RETURNS money
AS
BEGIN
DECLARE @Income money;
select @Income = SUM(Price)from DVD_Rental where MONTH(Borrowed_Date)=@month;
RETURN @Income;
END;

select dbo.findMonthRentalIncome(12) DVDIncome;



CREATE FUNCTION findDVDavailability(@DVD_Id varchar(8))
RETURNS varchar
AS
BEGIN
DECLARE @Copies int;
DECLARE @Result varchar(50);
select @Copies = No_of_Copies from DVD_Details where DVD_Id= @DVD_Id;

IF @Copies < 1
BEGIN
set @Result ='Not Available'
END

ELSE
BEGIN
select @Result = No_of_Copies from DVD_Details where DVD_Id= @DVD_Id;
END

RETURN @Result;
END;


select dbo.findDVDavailability('MD0003') DVD_Availability;
