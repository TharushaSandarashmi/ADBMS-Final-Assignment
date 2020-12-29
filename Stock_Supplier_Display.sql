
create procedure Stock_Supplier_Display
as
begin
select s.Item_ID,s.Item_Name,p.Supplier_ID,p.Supplier_Name
from Stock_Table s
 join Supplier_Table p
ON
s.Supplier_ID=p.Supplier_ID
End;
EXEC Stock_Supplier_Display