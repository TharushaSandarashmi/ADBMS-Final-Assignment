create procedure Item_infor(@Itemid int)
as
begin
select s.Item_ID,s.Item_Name,s.Item_Price,p.Supplier_ID,p.Supplier_Name
from Stock_Table s
 Inner join Supplier_Table p
ON
s.Supplier_ID=p.Supplier_ID
where s.Item_ID=@Itemid;
End;
EXEC Item_infor '20002';
EXEC Item_infor '50003';