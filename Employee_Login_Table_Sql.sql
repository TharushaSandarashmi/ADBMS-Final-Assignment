

CREATE TABLE Employee_Login_Table(
Login_ID varchar(10),
Login_Username varchar(50),
Login_Password varchar(20),
Employee_ID int
CONSTRAINT FK_empid FOREIGN KEY(Employee_ID) REFERENCES Employee_Table(Employee_ID));
