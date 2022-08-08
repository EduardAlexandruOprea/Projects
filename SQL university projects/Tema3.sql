--Am folosit o baza de date fata de cea folosita la tema 1 si 2

--joins--
 
 create table myemployee(employeeid int, fistname varchar(20), lastname varchar(20))
insert into myemployee values (6,'ABC','DDD'),(7,'BBB','FFF'),(8,'KKK','LLL'),(9,'VVV','ZZZ')
  
.
	select *from myemployee


	create table mysalary (employeeid int, salary float)

	 insert into mysalary values(1,10000),(2,5500),(3,14550)


	 select *from mysalary 
	 select *from myemployee

	 select A.fistname,A.lastname,B.salary 
	 from  myemployee A inner join mysalary B on A.employeeid=B.employeeid

	 ---LEFT OUTER JOIN

	select A.fistname,A.lastname,B.salary 
	FROM myemployee A LEFT OUTER JOIN mysalary B ON A.employeeid=B.employeeid

	CREATE TABLE MYPHONE(employeeid int, phonenumber int)
	insert into MYPHONE values(1,01234),(2,34523),(3,12314)
	select *from MYPHONE

		select A.fistname,A.lastname,B.salary ,C.phonenumber
	FROM myemployee A 
	LEFT OUTER JOIN mysalary B   ON A.employeeid=B.employeeid
	left outer join MYPHONE C on C.employeeid=B.employeeid


---right outer join

create table parking(employee_ID int,parking_spot varchar(20))
insert into parking values(1,'A1'),(2,'A2'),(3,'A3'),(4,'A4'),(5,'A5')
 create table my_employee(employee_ID int,employee_name varchar(20))
 insert into my_employee values(1,'Rex'),(2,'Josh'),(3,'Maya'),(4,'Annie'),(5,'Andrew'),(6,'Zoe')


select *from parking
select *from my_employee

select A.parking_spot, b.employee_name 
from parking A right join my_employee B on a.employee_ID=b.employee_ID 

--FULL OUTER JOIN

 create table MY_CUSTOMER(CUSTOMER_ID int,CUSTOMER_name varchar(20))
 insert into MY_CUSTOMER values(1,'Rex'),(2,'Josh')

 CREATE TABLE ORDERS(ORDER_NO INT , ORDER_NAME VARCHAR(20), CUSTOMER_ID INT)
 INSERT INTO ORDERS values(1,'ord1',1),(2,'ord2',6),(3,'ord3',7),(4,'ord1',8)
 update [ORDERS]
 set customer_id='2'
 where customer_id='6'
 select *from MY_CUSTOMER
 select *from ORDERS

 select a.CUSTOMER_ID,a.CUSTOMER_name,b.ORDER_NO, b.ORDER_NAME
 from MY_CUSTOMER A full outer join ORDERS B on a.CUSTOMER_ID=b.CUSTOMER_ID

 ---CROSS JOIN---

 create table my_employee2(employee_ID int , department_id varchar(5))
 insert into my_employee2 values(1,'A1'),(2,'A2')

 CREATE TABLE MY_DEPARTMENT2(DEPARTMENT_ID VARCHAR(5), DEPARTMENT_NAME VARCHAR(20))
 INSERT INTO MY_DEPARTMENT2 VALUES('A1','SALES'),('A2','MARKETING')
 SELECT *FROM my_employee2 CROSS JOIN MY_DEPARTMENT2
 