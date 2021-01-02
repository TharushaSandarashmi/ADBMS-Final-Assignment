create PROCEDURE update_No_of_Copies(@Recipt_Id int,@DVD_Id varchar(8),@No_of_DVD int,@Price money,@Borrowed_Date date,@Due_Date date,@Customer_Id int)
 As
 BEGIN
 
 insert into DVD_Rental(Recipt_Id,DVD_Id ,No_of_DVD ,Price ,Borrowed_Date ,Due_Date ,Customer_Id, Status) 
 values(@Recipt_Id, @DVD_Id, @No_of_DVD, @Price, @Borrowed_Date, @Due_Date, @Customer_Id,'NOT');
 
 update DVD_Details SET No_of_Copies = No_of_Copies - @No_of_DVD 
 where DVD_Id=@DVD_Id
 
 END;

 EXEC update_No_of_Copies  @Recipt_Id=11245, @DVD_Id='ED0003', @No_of_DVD=1, @Price=70, @Borrowed_Date='2020-12-29', @Due_Date='2021-01-05', @Customer_Id=914033;
 select * from DVD_Details;
 select * from DVD_Rental;
