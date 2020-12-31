
create table Sale_Table(
Bill_NO int NOT NULL,
Sale_Date date NOT NULL,
Item_ID int NOT NULL,
Item_Sale_Price float NOT NULL,
Item_Sale_Qty int NOT NULL,
Employee_ID int NOT NULL,
primary key(Bill_NO)
);

Select* from Sale_Table;