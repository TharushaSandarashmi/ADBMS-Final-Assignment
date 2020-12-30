use BookShopDB;

create table DVD_Details (
DVD_Id varchar(8) NOT NULL,
DVD_Name varchar(50),
Unit_Price money,
No_of_Copies int,
CONSTRAINT pk_DVDId PRIMARY KEY(DVD_Id));

select * from DVD_Details;

insert into DVD_Details values('MD0001','Tunnel',70 ,3 ),
('MD0002','Catch the Time',70 ,2 ),
('ED0001','Pre_School Study 1',50 ,2 ),
('ED0002','Pre_School Study 2',50 ,3 ),
('ED0003','Pre_School Study 3',50 ,4 ),
('SD0001','Blue Sky',70 ,2 ),
('SD0002','Jathika Pasala 1',60 ,2 ),
('MD0004','Black Rose',70 ,3 ),
('ED0004','Science_Grade10',50 ,4 ),
('SD0003','athika Pasala 2',60 ,2 );

create table DVD_Rental(
Recipt_Id int NOT NULL,
DVD_Id varchar(8) NOT NULL,
No_of_DVD int,
Price money,
Customer_Id int,
CONSTRAINT pk_ReciptId PRIMARY KEY(Recipt_Id));

select * from DVD_Rental;

insert into DVD_Rental values( 10112, 'MD0001',1 ,70 , 914033);
insert into DVD_Rental values( 10203, 'ED0001',1 ,50 , 914033);

alter table DVD_Rental add CONSTRAINT fk_DId  FOREIGN KEY (DVD_Id) REFERENCES DVD_Details(DVD_Id);
