create procedure Sale_Stock_Display
as
begin
select i.Item_ID,i.Item_Name,i.Item_Price,s.Bill_NO,s.Sale_date,s.Item_Sale_Qty
from Sale_Table s
 inner join Stock_Table i
ON
i.Item_ID=s.Item_ID
End;
EXEC Sale_Stock_Display