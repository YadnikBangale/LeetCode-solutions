/* Write your PL/SQL query statement below */
SELECT id FROM Weather w1 WHERE temperature > 
(SELECT w2.temperature FROM Weather w2 
WHERE w2.recordDate = w1.recordDate - 1);

/*w1 -> current day, w2 -> prev day */