# Write your MySQL query statement below
select E.name as Employee from Employee E 
join Employee E2 on E2.id = E.managerId and E.salary > E2.salary