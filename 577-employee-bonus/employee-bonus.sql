# Write your MySQL query statement below
SELECT e1.name, b1.bonus FROM Employee e1
LEFT JOIN Bonus b1 ON e1.empId = b1.empId
WHERE bonus IS NUll OR bonus < 1000;