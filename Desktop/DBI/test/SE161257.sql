create database TestDBI
use TestDBI

create table CHUYENNGANH (
	MACN varchar(20) primary key,
	TENCN varchar(50)
)

create table SINHVIEN (
	MASV varchar(20) primary key,
	HOTEN varchar(20),
	NGAYSINH DATE,
	MACN varchar(20)
	foreign key(MACN) references CHUYENNGANH(MACN)
)

create table MON (
	MAMON varchar(20) primary key,
	TENMON varchar (20),
	SOTINCHI int,
)

create table DANGKY (
	MASV varchar (20),
	MAMON varchar (20) ,
	LANDK int,
	NAMHOC varchar(20),
	HOCKY int,
	foreign key (MASV) references SINHVIEN(MASV),
	foreign key (MAMON) references MON(MAMON)
)
insert into SINHVIEN values ('F001','Phương Ngọc San', '2/3/2000', 'S01')
insert into SINHVIEN values ('F002','Trương Tam', '3/4/2001', 'S01')
insert into SINHVIEN values ('F003','Lý Tứ', '12/5/2001', 'S02')
insert into SINHVIEN values ('F004','Khưu Thế Cơ', '8/9/2000', 'S01')

insert into CHUYENNGANH values ('S01','Khoa học máy tính')
insert into CHUYENNGANH values ('S02','Công nghệ phần mềm')

insert into DANGKY values ('F001','M01', 1,'2019-2020', 1)
insert into DANGKY values ('F001','M01', 2,'2019-2020', 2)
insert into DANGKY values ('F002','M02', 1,'2019-2020', 1)
insert into DANGKY values ('F002','M01', 1,'2019-2021', 1)

insert into MON values ('M01','CSI', 3)
insert into MON values ('M02','DBI', 4)
insert into MON values ('M03','PRF192', 2)


select SINHVIEN.MASV, HOTEN, MACN from SINHVIEN
inner join DANGKY on DANGKY.MASV = SINHVIEN.MASV
where DANGKY.MAMON = 'M01' and 
DANGKY.LANDK = (select top 1 DANGKY.LANDK from DANGKY order by DANGKY.LANDK desc)

select MON.MAMON, MON.TENMON  from MON
inner join DANGKY on DANGKY.MAMON = MON.MAMON
where DANGKY.LANDK = 2 

