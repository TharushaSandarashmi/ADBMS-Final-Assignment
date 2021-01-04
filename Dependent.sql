use BookShopDB;
create table Dependent (
Dependent_Id varchar(5) NOT NULL,
Dependent_Name varchar(50),
Relationship varchar(15),
Dependent_DOB date,
Telephone_No int,
Employee_Id int,
CONSTRAINT pk_DependentId PRIMARY KEY (Dependent_Id));

select * from Dependent;

insert into Dependent values ('M001','Sujani Gunathilaka','wife','1983-03-14',0785963672,2),
('A001','Waruna Perera','husband','1982-05-23',0772343219,3),
('A002','Kumari Muhandiramge','Wife','1986-04-16',0715543310,4),
('E001','Suraj Silva','son','1998-06-26',0764332301,5),
('E002','Priyanthi Desilva','mother','1951-12-11',0715647786,6),
('E003','Tharidu Nirmala','son','2000-08-31',0789774465,7),
('S001','kusum Gunathilaka','mother','1966-11-02',0726789140,8),
('S002','Nayana Anuradini','wife','1989-08-05',0754442361,9),
('M002','Kumara Kirihenage','father','1949-01-07',0115722345,2); 

alter table Dependent add CONSTRAINT fk_EmployeeId  FOREIGN KEY (Employee_Id) REFERENCES Employee(Employee_Id) ON DELETE CASCADE;
