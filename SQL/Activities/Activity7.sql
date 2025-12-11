-- Activity 7

Select * from orders;

select sum(purchase_amount) AS "Total Sum" from orders;
select avg(purchase_amount) AS "Average" from orders;
select max(purchase_amount) AS "Maximum" from orders;
select min(purchase_amount) AS "Minumum" from orders;
select count(distinct salesman_id) AS "Total count" from orders;  -- Unique
select count (salesman_id) AS "Total count" from orders;   -- Total