-- Activity 10

Select * from orders
where salesman_id=(select DISTINCT salesman_id from orders where customer_id=3007);

Select * from orders
where salesman_id in (Select salesman_id from salesman where salesman_city='New York');

Select grade, count(*) from customers
group by grade having grade>(select avg(grade) from customers where city='New York');

select order_no, purchase_amount, order_date, salesman_id from orders
where salesman_id in( select salesman_id from salesman
where commission=( select max(commission) from salesman));