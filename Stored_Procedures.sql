use BookShopDB;
select @@VERSION;


CREAtE PROCEDURE show_rentsWiithRep_Id(@Rep_Id int)
AS
BEGIN
select * from DVD_Rental where Recipt_Id = @Rep_Id
END;

EXEC show_rentsWiithRep_Id @Rep_Id=10203;




CREAtE PROCEDURE show_rentsWithCustomerId(@customer_Id int)
AS
BEGIN
select * from DVD_Rental where Customer_Id = @customer_Id
END;

EXEC show_rentsWithCustomerId @Customer_Id=914033;




CREAtE PROCEDURE show_overdueRents
AS
BEGIN
select * from DVD_Rental where Due_Date < CAST(CURRENT_TIMESTAMP AS DATE) 
END;

EXEC show_overdueRents;




CREAtE PROCEDURE show_todayDueRents
AS
BEGIN
select * from DVD_Rental where Due_Date =   CAST(CURRENT_TIMESTAMP AS DATE) 
END;

EXEC show_todayDueRents;




CREAtE PROCEDURE show_overdueRentsNotRetun
AS
BEGIN
select * from DVD_Rental where Due_Date < CAST(CURRENT_TIMESTAMP AS DATE) AND Status='NOT'
END;

EXEC show_overdueRentsNotRetun;



CREATE PROCEDURE show_depentents(@Emp_Id int)
AS
BEGIN
select * from Dependent
JOIN Employee ON 
Dependent.Employee_Id = Employee.Employee_Id 
where Dependent.Employee_Id = @Emp_Id
END;

EXEC show_depentents @Emp_Id = 4;



CREAtE PROCEDURE show_DVDdetails(@DVD_Id varchar(8))
AS
BEGIN
select * from DVD_Details where DVD_Id = @DVD_Id
END;

EXEC show_DVDdetails @DVD_Id='MD0001';
