use BookShopDb;

create table Customer_Table (

Customer_Id int NOT NULL,
Customer_Name varchar(50) NOT NULL,
Quantity int,
Customer_Address varchar(50),
TelNo int,
Service_Id int,

CONSTRAINT pk_customer_id PRIMARY KEY (Customer_Id));

alter table Customer_Table add CONSTRAINT fk_SId  FOREIGN KEY (Service_Id) REFERENCES Service(Service_Id);
alter table Customer_Table drop CONSTRAINT fk_SId;



