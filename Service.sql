use BookShopDB;
create table Service (
Service_Id int NOT NULL,
Service_Name varchar(40) NOT NUll,
Unit_Price money,
Employee_Id int,
CONSTRAINT pk_ServiceId PRIMARY KEY (Service_Id));

select * from Service;

insert into Service values( 001,'Photocopy',3 ,5 ),
( 002,'Binding',70 ,6 ),
( 003 ,'B&W printout',5 ,8 ),
( 004,'Colour printout',10 ,8 ),
( 005,'Laminating',30 ,5 ),
( 006,'Typewriting',60 ,5 ),
( 007,'CD/DVD writing',50 ,6 ),
( 008,'Scanning',30 ,6 ),
( 009,'Letterhead printing',30 ,8 ),
( 010,'Graphic Design',50 ,6 );

alter table Service add CONSTRAINT fk_EId  FOREIGN KEY (Employee_Id) REFERENCES Employee(Employee_Id);
alter table Service drop CONSTRAINT fk_EId;
