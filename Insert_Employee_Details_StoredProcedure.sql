

CREATE PROCEDURE employeeDetails(
@name varchar(30),
@contactno varchar(10),
@address varchar(100),
@dob date,
@gender varchar(10),
@designation varchar(30),
@salary money)
AS
BEGIN
INSERT INTO Employee_Table(Employee_Name, Employee_ContactNo, Employee_Address, DOB, Gender, Designation, Salary)
VALUES (@name,@contactno,@address,@dob,@gender,@designation,@salary);
END;


select * from Employee_Table;