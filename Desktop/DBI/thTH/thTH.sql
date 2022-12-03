--1
select d.depName as'Tên phòng',coalesce( f.[Số nhân viên nữ],0) as [Số nhân viên nữ],coalesce(m.[Số nhân viên nam],0) as [Số nhân viên nam] 
from tblDepartment d left join (select e.depNum,count(e.empSex) as [Số nhân viên nữ] from tblEmployee e where e.empSex = 'F' group by e.depNum) f
on d.depNum = f.depNum
left join (select e.depNum,count(e.empSex) as [Số nhân viên nam] from tblEmployee e where e.empSex = 'M' group by e.depNum)m
on d.depNum = m.depNum 
--2
select a.SốNVnam, b.SốNVnu 
from (select empSex, count(empSex) as SốNVnam from tblEmployee
group by empSex
having empSex = 'M' ) a , (select empSex, count(empSex) as SốNVnu 
from tblEmployee 
group by empSex 
having empSex = 'F' )  b
--3
select * from tblEmployee
where (Year(GETDATE()) - Year(empBirthdate) ) < 50 and empSalary > 50000
--4
select * from tblEmployee
where depNum = 1  and empSalary > (select avg(empSalary) from tblEmployee where depNum = 2)
--5
create trigger hour_work on tblWorksOn
after insert
as
begin 
	 if ((select t.workHours  from inserted i inner join (select empSSN,sum(workHours) as[workHours]
	from tblWorksOn group by empSSN) t on t.empSSN = i.empSSN ) < 100 ) 
	begin
	print'false'
	end
	end
begin
	select i.empSSN,t.empName ,t.workHours,iif (t.workHours < 100, 'false', 'true')
	from 
	(select e.empSSN,e.empName,coalesce(t1.workHours,0) as[workHours]
	from tblEmployee e join (select empSSN,sum(workHours) as[workHours]
	from tblWorksOn group by empSSN) t1 on e.empSSN = t1.empSSN
	where coalesce(t1.workHours,0) <100 ) t , inserted i
	where i.empSSN= t.empSSN
	
end
drop trigger hour_work
insert into  tblWorksOn(empSSN,proNum,workHours)
values (30121050322,2,1)
	
