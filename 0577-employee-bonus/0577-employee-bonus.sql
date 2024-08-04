# Write your MySQL query statement below
select e.name,b.bonus FROM Employee as e
left join Bonus as b ON e.empID = b.empID
WHERE bonus < 1000 OR Bonus IS NULL ;