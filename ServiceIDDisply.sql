create procedure ServiceIDDisply
as
begin
select c.Customer_Id,c.Customer_Name ,s.Service_Id,s.Service_Name
from Customer_Table c
 join Service s
ON
c.Service_Id=s.Service_Id
End;
EXEC ServiceIDDisply