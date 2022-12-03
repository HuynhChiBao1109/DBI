--1
select empSSN, empName, empSalary from tblEmployee
where empSalary > 80000 and (Year(GetDate()) - Year(empBirthdate) ) > 50
--2
select supervisorSSN, empName, empBirthdate  from tblDepartment, tblEmployee
where supervisorSSN = mgrSSN and (Year(GetDate()) - Year(mgrAssDate) ) > 15
--3
select tblProject.proNum, tblProject.proName ,a.EmployeeJoin from (select proNum, count(proNum) as EmployeeJoin from tblWorksOn
group by proNum) a, tblProject
where tblProject.proNum = a.proNum and a.EmployeeJoin > 5
-- tạo bảng 

Create database ThucHanh;
use ThucHanh
Create table KHOA
(
	MaKH varchar(20) primary key,
	TenKH nvarchar(100),
	Diachi varchar(50),
	DT varchar (20)
)

Create table SINHVIEN
(
	MaSV varchar(20) primary key,
	Ho nvarchar(50),
	Ten nvarchar(50),
	Ngaysinh date,
	Noisinh varchar(50),
	MaKH varchar(20),
	DT varchar (20),
	foreign key (MaKH) references Khoa(MaKH)
)
Create table MONHOC
(
	MaMH varchar(20) PRIMARY KEY,
	TenMH varchar(50),
	Sogio int
)

Create table KETQUA
(
	MaSV varchar(20),
	MaMH VARCHAR(20),
	Lanthi int,
	Diem DECIMAL(8,3),
	foreign key (MaSV) references SINHVIEN(MaSV),
	foreign key (MaMH) references MONHOC(MaMH)
)
insert into KHOA(MAKH,TENKH,Diachi,DT)
values ('S01', N'Khoa học máy tính','P101','012345678'),
('S02', N'Công nghệ phần mềm','P102','023456789')

INSERT INTO SINHVIEN (MASV,Ho,Ten,Ngaysinh,Noisinh,MaKH,DT)
VALUES ('F001', N'Phương','San', '2/3/2000','Long An','S01','0778456923'),
('F002', N'Trương','Tam', '3/4/2001','Nha Trang', 'S01','0934567927'),
('F003', N'Lý', N'Tứ', '12/5/2001', N'Hồ Chí Minh', 'S02', '0132457866'),
('F004', N'Khưu', N'Cơ', '8/9/2000', N'Tây Ninh', 'S01', '0345621787')

INSERT INTO MONHOC(MaMH,TenMH,Sogio)
VALUES ('M01','CSI', 3),
('M02', 'DBI', 4),
('M03', 'PRF192', 2)

insert into KETQUA(MASV,MaMH,Lanthi,Diem)
values ('F001', 'M01', 1, 9),
('F001', 'M01', 2 , 3),
('F002', 'M02',1, 7),
('F002', 'M01',1,5)
--4
select MAMH , TenMH from MONHOC 
where MAMH = (select top 1 MaMH from KETQUA order by Lanthi desc) 
--5
select KHOA.MaKH, TenKH, a.SinhVienJoin from  KHOA 
join (select top 1 MaKH, count(MaKH) as SinhVienJoin from SINHVIEN
group by MaKH ) a on a.MaKH = KHOA.MaKH
--6
select s.MASV,s.Ten,k.Diem
from KETQUA k 
inner join (select MaMH, avg(Diem) as DTB from KETQUA where MaMH = 'M01' group by MaMH) b on k.MaMH = b.MaMH
inner join SINHVIEN s on s.MaSV = k.MaSV
where k.Diem >=  b.DTB
--7
GRANT SELECT, UPDATE, DELETE
ON SINHVIEN
TO PUBLIC
--8
create trigger quanlymonhoc on MONHOC
after insert
as
begin
    if (select COUNT(MaMH) as SoMonTren50h from (select MaMH,Sogio from MONHOC where Sogio > 50) m group by MaMH) 
	> (select COUNT(MaMH)*0.15 as TongSoMon from MONHOC) 
	begin
	print N'Số môn có số giờ trên 50 không được vượt quá 15% tổng số môn '
	end
	else
	begin
		select i.MaMH, i.TenMH, i.Sogio from MONHOC i 
	end
end
--9
create table Sinhviendiemnhohon3(
MaSV varchar (20) primary key,
DTB DECIMAL(8,3)
)


create trigger Diemtrungbinh on KETQUA
after insert
as
begin
    if (select AVG(k.Diem) as DTB from KETQUA  k inner join inserted i on k.MaMH = i.MaMH 
	where k.MaMH = i.MaMH group by k.MaMH) < 3
	begin
	print 'Sinh vien dac biet'
	end
    truncate table Sinhviendiemnhohon3
	insert into Sinhviendiemnhohon3(MaSV,DTB)
    select i.MaSV,t.DTB
    from 
    (select MaSV,AVG(k.Diem) as DTB from KETQUA  k
    where coalesce(k.DTB,0) <100 ) t ,inserted i 
    where i.MaSV = t.MaSV

end