# Write your MySQL query statement below
#select * from  e.name ,b.bonus from Employee e join Bonus b where b.bonus<1000;
#
select e.name ,b.bonus from Employee e  left join Bonus b On e.empId=b.empId where b.bonus<1000 ||b.bonus is null;