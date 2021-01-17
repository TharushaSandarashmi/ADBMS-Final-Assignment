create procedure Bill_Infor(@billno int)
as
begin
select i.Item_ID,i.Item_Name,i.Item_Price,s.Bill_NO,s.Sale_date,s.Item_Sale_Qty
from Sale_Table s
 inner join Stock_Table i
ON
i.Item_ID=s.Item_ID
where s.Bill_NO=@billno;
End;

EXEC Bill_Infor '4012';
EXEC Bill_Infor '4005';
EXEC Bill_Infor '4010';