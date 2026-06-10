/* Write your PL/SQL query statement below */
SELECT product_name, sum(unit) as unit FROM Products Natural Join Orders WHERE 
order_date BETWEEN '2020-02-01' AND '2020-02-29' GROUP BY product_name having sum(unit) >=100;