create procedure Sale_Employee_Display
as
begin
select s.Bill_NO,s.Item_ID,s.Sale_Date,e.Employee_ID,e.Employee_Name
from Sale_Table s
 Inner join Employee_Table e
ON
s.Employee_ID=e.Employee_ID
End;
EXEC Sale_Employee_Display