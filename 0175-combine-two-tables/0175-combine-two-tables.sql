# Write your MySQL query statement below
SELECT
    p.firstName,
    p.lastName,
    a.City,
    a.State
FROM
    person p
LEFT JOIN
    Address a
ON 
   p.personId=a.personId;