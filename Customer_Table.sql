use BookShopDb;

create table Customer_Table (

Customer_Id int NOT NULL,
Customer_Name varchar(50) NOT NULL,
Quantity int,
Customer_Address varchar(50),
TelNo int,
Service_Id int,

CONSTRAINT pk_customer_id PRIMARY KEY (Customer_Id));



