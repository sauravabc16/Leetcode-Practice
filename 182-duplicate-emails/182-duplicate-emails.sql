/* Write your T-SQL query statement below */

Select email
from Person
group by email
having count(*)>1
