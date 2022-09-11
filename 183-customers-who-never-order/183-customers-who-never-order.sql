/* Write your T-SQL query statement below */
-- select c.name
-- from customers c 
-- join orders o on c.id = o.customerid
-- where o.customerid is null

-- SELECT name AS Customers
-- FROM Customers
-- WHERE id NOT IN (SELECT customerId FROM Orders)

SELECT C.name AS Customers FROM CUSTOMERS AS C LEFT JOIN ORDERS AS O ON C.id = O.customerId WHERE O.customerId IS NULL;