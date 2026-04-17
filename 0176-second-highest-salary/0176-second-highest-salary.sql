/* Write your PL/SQL query statement below */
SELECT max(salary) As SecondHighestSalary from Employee where 
salary < (SELECT max(salary) from Employee);