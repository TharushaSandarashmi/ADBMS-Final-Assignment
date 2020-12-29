

CREATE TABLE Employee_Table(
Employee_ID int NOT NULL identity(1,1),
Employee_Name varchar(50) NOT NULL,
Employee_ContactNo varchar(10) NOT NULL,
Employee_Address varchar(100) NOT NULL,
DOB date,
Gender varchar(10),
Designation varchar(30),
Salary money
CONSTRAINT PK_empid PRIMARY KEY(Employee_ID));

