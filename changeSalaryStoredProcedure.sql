CREATE PROCEDURE changeSalary(@designation varchar(30),@salary money)
AS
BEGIN
update Employee_Table set Salary=@salary where Designation=@designation;
END;

EXEC changeSalary 'Accountant','35000';