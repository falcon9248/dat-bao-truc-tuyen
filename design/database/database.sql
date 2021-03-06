﻿CREATE DATABASE [Nhom11_DatBaoTrucTuyen_SpringMVC]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'Nhom11_DatBaoTrucTuyen_SpringMVC', FILENAME = N'D:\database\Nhom11_DatBaoTrucTuyen_SpringMVC.mdf' , SIZE = 3264KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'Nhom11_DatBaoTrucTuyen_SpringMVC_log', FILENAME = N'D:\database\Nhom11_DatBaoTrucTuyen_SpringMVC_log.ldf' , SIZE = 816KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO

use Nhom11_DatBaoTrucTuyen_SpringMVC

SET DATEFORMAT dmy

drop table ChiTietHoaDon
drop table Bao
drop table HoaDon
drop table KhachHang
drop table TaiKhoan

create table TaiKhoan
(
	MaTK int IDENTITY primary key,
	TenDangNhap nvarchar(50) not null,
	MatKhau nvarchar(50) not null,
	PhanQuyen int not null,
)

create table  KhachHang
(
	MaKH int IDENTITY primary key not null,
	TenKH nvarchar(100) not null,
	DienThoai nvarchar(20) not null,
	DiaChi nvarchar(200) not null,
	NgaySinh datetime not null,
	Cmnd nvarchar(20) not null,
	MaTK int unique foreign key references TaiKhoan(MaTK)
)

create table HoaDon
(
	MaHD int IDENTITY primary key not null,
	MaKH int not null,
	NgayLapHD datetime not null,
	TongTienHD money not null,
	TrangThaiHD int,
	MaNguoiDuyet int,
	foreign key(MaKH) references KhachHang(MaKH)
)

create table Bao
(
	MaBao nvarchar(50) primary key not null,
	TenBao nvarchar(100) not null,
	AnhBao nvarchar(100) not null,
	DonGia money not null,
	ChiTietBao nvarchar(2000),
	NhaXuatBan nvarchar(100),
	TheLoai int not null,
	TrangThai int not null,
)

create table ChiTietHoaDon(
	MaHD int not null,
	MaBao nvarchar(50) not null,
	SoLuong int,
	ThanhTien money,
	ThoiGianDatBao int,
	foreign key (MaHD) references HoaDon(MaHD),
	foreign key (MaBao) references Bao(MaBao),
	primary key (MaHD, MaBao)
)

insert into TaiKhoan values(N'taikhoan1', N'123456', 0)
insert into TaiKhoan values(N'taikhoan2', N'123456', 0)
insert into TaiKhoan values(N'taikhoan3', N'123456', 0)

insert into KhachHang values(N'Nguyễn Văn A', N'0932864812', N'Quận 8', 12/05/1995, N'123456789', 1)
insert into KhachHang values(N'Nguyễn Văn B', N'0942864486', N'Quận 8', 05/09/1995, N'129845789', 2)
insert into KhachHang values(N'Nguyễn Văn C', N'0932954812', N'Quận 8', 03/03/1995, N'846856789', 3)

insert into Bao values(N'bao001', N'Ẩm thực Việt Nam', N'images/amthuc-pic-1.jpg', 20000, N'Chi tiet nd 1', N'Nhà xuất bản A', 1, 1)
insert into Bao values(N'bao002', N'Món ngon Việt Nam', N'images/amthuc-pic-2.jpg', 10000, N'Chi tiet nd 2', N'Nhà xuất bản B', 1, 1)
insert into Bao values(N'bao003', N'Taste Event', N'images/amthuc-pic-3.jpg', 20000, N'Chi tiet nd 3', N'Nhà xuất bản C', 1, 1)
insert into Bao values(N'bao004', N'360 Ẩm thực', N'images/amthuc-pic-4.jpg', 30000, N'Chi tiet nd 4', N'Nhà xuất bản D', 1, 1)
insert into Bao values(N'bao005', N'Forhes', N'images/doanhnhan-pic-1.jpg', 25000, N'Chi tiet nd 5', N'Nhà xuất bản E', 2, 1)
insert into Bao values(N'bao006', N'Doanh nhân', N'images/doanhnhan-pic-2.jpg', 30000, N'Chi tiet nd 6', N'Nhà xuất bản F', 2, 1)
insert into Bao values(N'bao007', N'Phong cách Doanh nhân', N'images/doanhnhan-pic-3.jpg', 25000, N'Chi tiet nd 7', N'Nhà xuất bản G', 2, 1)
insert into Bao values(N'bao008', N'Thể thao 24h', N'images/thethao-pic-1.jpg', 20000, N'Chi tiet nd 8', N'Nhà xuất bản H', 3, 1)
insert into Bao values(N'bao009', N'Tennis', N'images/thethao-pic-2.jpg', 25000, N'Chi tiet nd 9', N'Nhà xuất bản I', 3, 1)
insert into Bao values(N'bao010', N'Thể thao', N'images/thethao-pic-3.jpg', 15000, N'Chi tiet nd 10', N'Nhà xuất bản J', 3, 1)
insert into Bao values(N'bao011', N'Tuổi trẻ', N'images/doisong-pic-1.jpg', 10000, N'Chi tiet nd 11', N'Nhà xuất bản K', 4, 1)
insert into Bao values(N'bao012', N'Thanh niên', N'images/doisong-pic-2.jpg', 15000, N'Chi tiet nd 12', N'Nhà xuất bản L', 4, 1)
insert into Bao values(N'bao013', N'Người lao động', N'images/doisong-pic-3.jpg', 12000, N'Chi tiet nd 13', N'Nhà xuất bản M', 4, 1)
insert into Bao values(N'bao014', N'Công an', N'images/doisong-pic-4.jpg', 18000, N'Chi tiet nd 14', N'Nhà xuất bản N', 4, 1)
