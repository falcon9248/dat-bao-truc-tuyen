USE [master]
GO
/****** Object:  Database [Nhom11_DatBaoTrucTuyen_SpringMVC]    Script Date: 09/05/2018 11:00:23 ******/
CREATE DATABASE [Nhom11_DatBaoTrucTuyen_SpringMVC]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'Nhom11_DatBaoTrucTuyen_SpringMVC', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.SQLEXPRESS\MSSQL\DATA\Nhom11_DatBaoTrucTuyen_SpringMVC.mdf' , SIZE = 3264KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'Nhom11_DatBaoTrucTuyen_SpringMVC_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.SQLEXPRESS\MSSQL\DATA\Nhom11_DatBaoTrucTuyen_SpringMVC_log.ldf' , SIZE = 560KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [Nhom11_DatBaoTrucTuyen_SpringMVC] SET COMPATIBILITY_LEVEL = 120
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [Nhom11_DatBaoTrucTuyen_SpringMVC].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [Nhom11_DatBaoTrucTuyen_SpringMVC] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [Nhom11_DatBaoTrucTuyen_SpringMVC] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [Nhom11_DatBaoTrucTuyen_SpringMVC] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [Nhom11_DatBaoTrucTuyen_SpringMVC] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [Nhom11_DatBaoTrucTuyen_SpringMVC] SET ARITHABORT OFF 
GO
ALTER DATABASE [Nhom11_DatBaoTrucTuyen_SpringMVC] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [Nhom11_DatBaoTrucTuyen_SpringMVC] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [Nhom11_DatBaoTrucTuyen_SpringMVC] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [Nhom11_DatBaoTrucTuyen_SpringMVC] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [Nhom11_DatBaoTrucTuyen_SpringMVC] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [Nhom11_DatBaoTrucTuyen_SpringMVC] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [Nhom11_DatBaoTrucTuyen_SpringMVC] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [Nhom11_DatBaoTrucTuyen_SpringMVC] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [Nhom11_DatBaoTrucTuyen_SpringMVC] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [Nhom11_DatBaoTrucTuyen_SpringMVC] SET  ENABLE_BROKER 
GO
ALTER DATABASE [Nhom11_DatBaoTrucTuyen_SpringMVC] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [Nhom11_DatBaoTrucTuyen_SpringMVC] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [Nhom11_DatBaoTrucTuyen_SpringMVC] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [Nhom11_DatBaoTrucTuyen_SpringMVC] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [Nhom11_DatBaoTrucTuyen_SpringMVC] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [Nhom11_DatBaoTrucTuyen_SpringMVC] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [Nhom11_DatBaoTrucTuyen_SpringMVC] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [Nhom11_DatBaoTrucTuyen_SpringMVC] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [Nhom11_DatBaoTrucTuyen_SpringMVC] SET  MULTI_USER 
GO
ALTER DATABASE [Nhom11_DatBaoTrucTuyen_SpringMVC] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [Nhom11_DatBaoTrucTuyen_SpringMVC] SET DB_CHAINING OFF 
GO
ALTER DATABASE [Nhom11_DatBaoTrucTuyen_SpringMVC] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [Nhom11_DatBaoTrucTuyen_SpringMVC] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [Nhom11_DatBaoTrucTuyen_SpringMVC] SET DELAYED_DURABILITY = DISABLED 
GO
USE [Nhom11_DatBaoTrucTuyen_SpringMVC]
GO
/****** Object:  Table [dbo].[Bao]    Script Date: 09/05/2018 11:00:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Bao](
	[MaBao] [nvarchar](50) NOT NULL,
	[TenBao] [nvarchar](100) NOT NULL,
	[AnhBao] [nvarchar](100) NOT NULL,
	[DonGia] [money] NOT NULL,
	[ChiTietBao] [nvarchar](2000) NULL,
	[NhaXuatBan] [nvarchar](100) NULL,
	[TheLoai] [int] NOT NULL,
	[TrangThai] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaBao] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[ChiTietHoaDon]    Script Date: 09/05/2018 11:00:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietHoaDon](
	[MaHD] [int] NOT NULL,
	[MaBao] [nvarchar](50) NOT NULL,
	[SoLuong] [int] NULL,
	[ThanhTien] [money] NULL,
	[ThoiGianDatBao] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaHD] ASC,
	[MaBao] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 09/05/2018 11:00:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[MaHD] [int] IDENTITY(1,1) NOT NULL,
	[MaKH] [int] NOT NULL,
	[NgayLapHD] [datetime] NOT NULL,
	[TongTienHD] [money] NOT NULL,
	[TrangThaiHD] [int] NULL,
	[MaNguoiDuyet] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaHD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 09/05/2018 11:00:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[MaKH] [int] IDENTITY(1,1) NOT NULL,
	[TenKH] [nvarchar](100) NOT NULL,
	[DienThoai] [nvarchar](20) NOT NULL,
	[DiaChi] [nvarchar](200) NOT NULL,
	[NgaySinh] [datetime] NOT NULL,
	[Cmnd] [nvarchar](20) NOT NULL,
	[MaTK] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaKH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[TaiKhoan]    Script Date: 09/05/2018 11:00:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaiKhoan](
	[MaTK] [int] IDENTITY(1,1) NOT NULL,
	[TenDangNhap] [nvarchar](50) NOT NULL,
	[MatKhau] [nvarchar](50) NOT NULL,
	[PhanQuyen] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaTK] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
INSERT [dbo].[Bao] ([MaBao], [TenBao], [AnhBao], [DonGia], [ChiTietBao], [NhaXuatBan], [TheLoai], [TrangThai]) VALUES (N'bao001', N'Ẩm thực Việt Nam', N'images/amthuc-pic-1.jpg', 20000.0000, N'Chi tiet nd 1', N'Nhà xuất bản A', 1, 1)
INSERT [dbo].[Bao] ([MaBao], [TenBao], [AnhBao], [DonGia], [ChiTietBao], [NhaXuatBan], [TheLoai], [TrangThai]) VALUES (N'bao002', N'Món ngon Việt Nam', N'images/amthuc-pic-2.jpg', 10000.0000, N'Chi tiet nd 2', N'Nhà xuất bản B', 1, 1)
INSERT [dbo].[Bao] ([MaBao], [TenBao], [AnhBao], [DonGia], [ChiTietBao], [NhaXuatBan], [TheLoai], [TrangThai]) VALUES (N'bao003', N'Taste Event', N'images/amthuc-pic-3.jpg', 20000.0000, N'Chi tiet nd 3', N'Nhà xuất bản C', 1, 1)
INSERT [dbo].[Bao] ([MaBao], [TenBao], [AnhBao], [DonGia], [ChiTietBao], [NhaXuatBan], [TheLoai], [TrangThai]) VALUES (N'bao004', N'360 Ẩm thực', N'images/amthuc-pic-4.jpg', 30000.0000, N'Chi tiet nd 4', N'Nhà xuất bản D', 1, 1)
INSERT [dbo].[Bao] ([MaBao], [TenBao], [AnhBao], [DonGia], [ChiTietBao], [NhaXuatBan], [TheLoai], [TrangThai]) VALUES (N'bao005', N'Forhes', N'images/doanhnhan-pic-1.jpg', 25000.0000, N'Chi tiet nd 5', N'Nhà xuất bản E', 2, 1)
INSERT [dbo].[Bao] ([MaBao], [TenBao], [AnhBao], [DonGia], [ChiTietBao], [NhaXuatBan], [TheLoai], [TrangThai]) VALUES (N'bao006', N'Doanh nhân', N'images/doanhnhan-pic-2.jpg', 30000.0000, N'Chi tiet nd 6', N'Nhà xuất bản F', 2, 1)
INSERT [dbo].[Bao] ([MaBao], [TenBao], [AnhBao], [DonGia], [ChiTietBao], [NhaXuatBan], [TheLoai], [TrangThai]) VALUES (N'bao007', N'Phong cách Doanh nhân', N'images/doanhnhan-pic-3.jpg', 25000.0000, N'Chi tiet nd 7', N'Nhà xuất bản G', 2, 1)
INSERT [dbo].[Bao] ([MaBao], [TenBao], [AnhBao], [DonGia], [ChiTietBao], [NhaXuatBan], [TheLoai], [TrangThai]) VALUES (N'bao008', N'Thể thao 24h', N'images/thethao-pic-1.jpg', 20000.0000, N'Chi tiet nd 8', N'Nhà xuất bản H', 3, 1)
INSERT [dbo].[Bao] ([MaBao], [TenBao], [AnhBao], [DonGia], [ChiTietBao], [NhaXuatBan], [TheLoai], [TrangThai]) VALUES (N'bao009', N'Tennis', N'images/thethao-pic-2.jpg', 25000.0000, N'Chi tiet nd 9', N'Nhà xuất bản I', 3, 1)
INSERT [dbo].[Bao] ([MaBao], [TenBao], [AnhBao], [DonGia], [ChiTietBao], [NhaXuatBan], [TheLoai], [TrangThai]) VALUES (N'bao010', N'Thể thao', N'images/thethao-pic-3.jpg', 15000.0000, N'Chi tiet nd 10', N'Nhà xuất bản J', 3, 1)
INSERT [dbo].[Bao] ([MaBao], [TenBao], [AnhBao], [DonGia], [ChiTietBao], [NhaXuatBan], [TheLoai], [TrangThai]) VALUES (N'bao011', N'Tuổi trẻ', N'images/doisong-pic-1.jpg', 10000.0000, N'Chi tiet nd 11', N'Nhà xuất bản K', 4, 1)
INSERT [dbo].[Bao] ([MaBao], [TenBao], [AnhBao], [DonGia], [ChiTietBao], [NhaXuatBan], [TheLoai], [TrangThai]) VALUES (N'bao012', N'Thanh niên', N'images/doisong-pic-2.jpg', 15000.0000, N'Chi tiet nd 12', N'Nhà xuất bản L', 4, 1)
INSERT [dbo].[Bao] ([MaBao], [TenBao], [AnhBao], [DonGia], [ChiTietBao], [NhaXuatBan], [TheLoai], [TrangThai]) VALUES (N'bao013', N'Người lao động', N'images/doisong-pic-3.jpg', 12000.0000, N'Chi tiet nd 13', N'Nhà xuất bản M', 4, 1)
INSERT [dbo].[Bao] ([MaBao], [TenBao], [AnhBao], [DonGia], [ChiTietBao], [NhaXuatBan], [TheLoai], [TrangThai]) VALUES (N'bao014', N'Công an', N'images/doisong-pic-4.jpg', 18000.0000, N'Chi tiet nd 14', N'Nhà xuất bản N', 4, 1)
INSERT [dbo].[ChiTietHoaDon] ([MaHD], [MaBao], [SoLuong], [ThanhTien], [ThoiGianDatBao]) VALUES (1, N'bao002', 2, 50004.0000, 2)
SET IDENTITY_INSERT [dbo].[HoaDon] ON 

INSERT [dbo].[HoaDon] ([MaHD], [MaKH], [NgayLapHD], [TongTienHD], [TrangThaiHD], [MaNguoiDuyet]) VALUES (1, 3, CAST(N'1900-01-01 00:00:00.000' AS DateTime), 5000000.0000, 0, 5)
SET IDENTITY_INSERT [dbo].[HoaDon] OFF
SET IDENTITY_INSERT [dbo].[KhachHang] ON 

INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [DienThoai], [DiaChi], [NgaySinh], [Cmnd], [MaTK]) VALUES (1, N'Nguyễn Văn A', N'0932864812', N'Quận 8', CAST(N'1900-01-01 00:00:00.000' AS DateTime), N'123456789', 1)
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [DienThoai], [DiaChi], [NgaySinh], [Cmnd], [MaTK]) VALUES (2, N'Nguyễn Văn B', N'0942864486', N'Quận 8', CAST(N'1900-01-01 00:00:00.000' AS DateTime), N'129845789', 2)
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [DienThoai], [DiaChi], [NgaySinh], [Cmnd], [MaTK]) VALUES (3, N'Nguyễn Văn C', N'0932954812', N'Quận 8', CAST(N'1900-01-01 00:00:00.000' AS DateTime), N'846856789', 3)
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [DienThoai], [DiaChi], [NgaySinh], [Cmnd], [MaTK]) VALUES (5, N'ad', N'05453343543', N'Quận 1', CAST(N'1900-01-01 00:00:00.000' AS DateTime), N'027766688', 4)
SET IDENTITY_INSERT [dbo].[KhachHang] OFF
SET IDENTITY_INSERT [dbo].[TaiKhoan] ON 

INSERT [dbo].[TaiKhoan] ([MaTK], [TenDangNhap], [MatKhau], [PhanQuyen]) VALUES (1, N'taikhoan1', N'123456', 0)
INSERT [dbo].[TaiKhoan] ([MaTK], [TenDangNhap], [MatKhau], [PhanQuyen]) VALUES (2, N'taikhoan2', N'123456', 0)
INSERT [dbo].[TaiKhoan] ([MaTK], [TenDangNhap], [MatKhau], [PhanQuyen]) VALUES (3, N'taikhoan3', N'123456', 0)
INSERT [dbo].[TaiKhoan] ([MaTK], [TenDangNhap], [MatKhau], [PhanQuyen]) VALUES (4, N'ad', N'ad', 1)
SET IDENTITY_INSERT [dbo].[TaiKhoan] OFF
/****** Object:  Index [UQ__KhachHan__27250071DF9E16C8]    Script Date: 09/05/2018 11:00:23 ******/
ALTER TABLE [dbo].[KhachHang] ADD UNIQUE NONCLUSTERED 
(
	[MaTK] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
ALTER TABLE [dbo].[ChiTietHoaDon]  WITH CHECK ADD FOREIGN KEY([MaBao])
REFERENCES [dbo].[Bao] ([MaBao])
GO
ALTER TABLE [dbo].[ChiTietHoaDon]  WITH CHECK ADD FOREIGN KEY([MaHD])
REFERENCES [dbo].[HoaDon] ([MaHD])
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD FOREIGN KEY([MaKH])
REFERENCES [dbo].[KhachHang] ([MaKH])
GO
ALTER TABLE [dbo].[KhachHang]  WITH CHECK ADD FOREIGN KEY([MaTK])
REFERENCES [dbo].[TaiKhoan] ([MaTK])
GO
USE [master]
GO
ALTER DATABASE [Nhom11_DatBaoTrucTuyen_SpringMVC] SET  READ_WRITE 
GO
