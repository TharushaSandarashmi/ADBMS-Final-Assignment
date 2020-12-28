create Database BookShopDb;
GO
use BookShopDb;

create table Supplier_Table(
Supplier_Id int NOT NULL,
Supplier_Name varchar(40)NOT NULL,
Supplier_ContactNo int NOT NULL,
Supplier_Address varchar(50),
Supply_Date varchar(30),

CONSTRAINT pk_Supplier_Id PRIMARY KEY (Supplier_Id)
);

