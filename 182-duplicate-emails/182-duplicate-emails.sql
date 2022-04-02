# Write your MySQL query statement below
SELECT Distinct A.email AS Email from Person A, Person B WHERE A.email = B.email AND A.id != B.id;