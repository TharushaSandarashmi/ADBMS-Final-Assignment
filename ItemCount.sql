Create trigger ItemCount
ON Stock_Table
after insert 
as
declare
@count int
begin
Update Stock_Table Set @count=@count+1
Where
Item_ID=Item_ID;
End;

Insert into Stock_Table values(20020,'Flie Cover',20,170,186053);