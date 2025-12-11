-- Activity 9

Select * from orders;

select a.customer_name as "Customer's Name", a.city, b.salesman_name as "Salesman", b.commission from customers a 
inner join salesman b on a.salesman_id=b.salesman_id;

Select a.customer_name, a.city, a.grade, b.salesman_name AS "Salesman", b.salesman_city from customers a 
LEFT OUTER join salesman b on a.salesman_id=b.salesman_id where a.grade<300 
Order by a.customer_id;

Select a.customer_name as "Customer Name", a.city, b.salesman_name as "Salesman", b.commission from customers a 
inner join salesman b on a.salesman_id=b.salesman_id 
where b.commission>12;

select a.order_no, a.order_date, a.purchase_amount, b.customer_name as "Customer Name", b.grade, c.salesman_name as "Salesman", c.commission from orders a 
inner join customers b on a.customer_id=b.customer_id 
inner join salesman c on a.salesman_id=c.salesman_id;