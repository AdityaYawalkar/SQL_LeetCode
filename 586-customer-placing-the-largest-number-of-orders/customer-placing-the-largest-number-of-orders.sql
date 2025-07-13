# Write your MySQL query statement below
SELECT customer_number FROM orders
GROUP BY 1
HAVING count(customer_number) = (
    SELECT max(counter) FROM (SELECT count(customer_number) AS counter FROM orders GROUP BY customer_number) AS temp_table)