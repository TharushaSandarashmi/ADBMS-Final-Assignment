

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


Exec updateEmployeeDetails '2','Kirihenage Dikson Thilaksiri','0756187782','172 Samagi mawatha, Pitipana, Homagama','1981-10-25','Male','Execative Manager','38000';

Exec updateEmployeeDetails '3','Dona Dilshani Kavindya Samaraweera','0773988941','82/4, Udugoda, Bandaragama','1983-02-05','Female','Accountant','32000';

Exec updateEmployeeDetails '5','Biyanka Prasadi','0756511823','129 Pasal mawatha, Sawgas handiya, Horana','1989-07-09','Female','Accountant','32000';

Exec updateEmployeeDetails '8','Udani Hansini Fernando','0715516139','188/B, Pasal mawatha, Kaluthara','1987-11-02','Female','Employee','22000';