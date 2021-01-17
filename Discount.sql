--discount price for literature month
create function Discount(@itemid int)
returns money
as 
begin
declare @discounted_price money
select @discounted_price=Item_Price-(Item_Price*0.05)
from Stock_Table
Where Item_ID=@itemid
return @discounted_price
end;

select dbo.Discount4('50002') as Discount_Price;
select dbo.Discount4('20010') as Discount_Price;