/* Write your T-SQL query statement below */

select p.firstname, p.lastname, a.city, a.state 
from Person p
left outer join address a
on p.personid = a.personid

