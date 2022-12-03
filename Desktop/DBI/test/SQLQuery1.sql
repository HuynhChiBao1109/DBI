use FUH_COMPANY
--1. Tìm những nhân viên trên 50 tuổi và có thu nhập trên 80 ngàn. Thông tin truy xuất bao gồm: mã nhân viên, tên nhân viên, thu nhập.
select empSSN, empName, empSalary from tblEmployee
where ( YEAR(GetDATE()) - YEAR(empBirthdate) > 50 ) and empSalary > 80000
--2. Tìm những người có thâm  niên làm trưởng phòng hơn 15 năm. Thông tin hiển thị bao gồm: mã trưởng phòng, họ tên, ngày sinh.
SELECT e.empSSN, e.empName, e.empBirthdate
FROM tblEmployee e
inner join tblDepartment d ON d.mgrSSN = e.empSSN
WHERE  (YEAR(GETDATE()) - YEAR(d.mgrAssDate) > 15)
--3. Tìm những dự bán có trên 5 người tham gia. Thông tin truy xuất bao gồm mã dự án, tên dự bán, số người tham gia.

select tblProject.proName,e.proNum, e.employeeJoin
from (select proNum, COUNT(proNum) as "employeeJoin" from tblWorksOn 
group by proNum ) e 
inner join tblProject on e.proNum = tblProject.proNum
where e.employeeJoin > 5

--4. Tìm những nhân viên có mức lương lớn hơn hoặc bằng mức lương trung bình của cả công ty. Thông tin hiển thị bao gồm mã nhân viên, tên nhân viên, mức lương.
SELECT empSSN, empName, empSalary FROM tblEmployee
WHERE empSalary >= (SELECT avg(empSalary) FROM tblEmployee) 
--5. Dùng DCL để cấp quyền Select, Update, Delete cho một, hoặc nhiều cột trên bảng nào đó (do sv chọn)
GRANT SELECT, UPDATE, DELETE
ON tblEmployee
TO PUBLIC