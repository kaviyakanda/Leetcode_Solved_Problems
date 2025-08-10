# Write your MySQL query statement below
select s.user_id ,
round(ifnull(sum(c.action='confirmed')/count(s.user_id),0),2) as confirmation_rate
from Signups s left join confirmations c
on s.user_id=c.user_id
group by s.user_id;
