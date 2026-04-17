/* Write your PL/SQL query statement below */
SELECT D.name as Department, E.name as Employee, E.salary as Salary
from Employee E JOIN Department D on E.departmentId = D.id
where E.salary = (Select max(salary) from Employee where departmentId = E.departmentId);
