-- Online SQL Editor to Run SQL Online.
-- Use the editor to create new tables, insert data and all other SQL operations.
  
-- 1. GET 
-- select first_name,age from Customers where age > 25 and country = "USA" or country = "UK" order by age

-- 2. inserting query

 --insert into customers (customer_id,first_name,last_name,age) values (8,"md","riyaz3",42)

-- 3. update
-- update Customers set country = "IND" where last_name = "riyaz3"

-- 4. delete 
-- delete from Customers where last_name = "riyaz"

-- 5. limit
--select customer_id,last_name,age from Customers where age > 25 limit 2 -- first2
--select customer_id,last_name,age from Customers where age > 25 limit 2 offset 2 --last 2

-- 6. min() max() function

-- select first_name,last_name,max(age) as age  from Customers
-- select first_name,last_name,min(age) as age  from Customers

-- 7.  count(), avg(), sum()
-- count return number rows matched in given creiteria
-- select count(age) from Customers where age > 25
-- avg return avg of numerical row
-- select avg(age) from Customers where age > 10
-- sum return sum if all rows
-- select sum(age) from Customers where age > 10

-- 8. like is used for search pattern
-- select * from Customers where last_name like 'r%'

--9. wildcard characters
-- char% matches the string start with char
-- %char matches the string ends with char
-- select * from Customers where last_name like 'R_%'

--10. IN operator
-- IN operator is shorthand of OR
--select first_name,last_name from Customers where country in ('USA','IND')
-- select first_name,last_name from Customers where customer_id in (select customer_id from Orders)

--11. between
-- select * from Customers where country between 'USA' and 'IND'
--select * from Customers where age between 28 and 42

--12. alias
-- select c.last_name, o.item, o.amount from Customers as c, Orders as o where c.customer_id = o.customer_id


--x13.groupBy,having
-- group by used to filter from agregate function
-- having used to filter from groups
-- select country, count(customer_id) as customers, max(age), last_name from Customers group by country having max(age) > 20 order by customers
