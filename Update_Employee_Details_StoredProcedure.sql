

CREATE PROCEDURE updateEmployeeDetails(
@id int,
@name varchar(30),
@contactno varchar(10),
@address varchar(100),
@dob date,
@gender varchar(10),
@designation varchar(30),
@salary money)
AS
BEGIN
UPDATE Employee_Table SET Employee_Name=@name, Employee_ContactNo=@contactno, Employee_Address=@address, DOB=@dob,
Gender=@gender, Designation=@designation, Salary=@salary 
WHERE Employee_ID=@id;
END;

