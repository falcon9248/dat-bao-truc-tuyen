USE [master]
GO
/****** Object:  Database [Nhom11_DatBaoTrucTuyen_SpringMVC]    Script Date: 02/05/2018 08:31:19 ******/
CREATE DATABASE [Nhom11_DatBaoTrucTuyen_SpringMVC]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'Nhom11_DatBaoTrucTuyen_SpringMVC', FILENAME = N'D:\database\Nhom11_DatBaoTrucTuyen_SpringMVC.mdf' , SIZE = 3072KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'Nhom11_DatBaoTrucTuyen_SpringMVC_log', FILENAME = N'D:\database\Nhom11_DatBaoTrucTuyen_SpringMVC_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
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
ALTER DATABASE [Nhom11_DatBaoTrucTuyen_SpringMVC] SET AUTO_CLOSE OFF 
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
ALTER DATABASE [Nhom11_DatBaoTrucTuyen_SpringMVC] SET  DISABLE_BROKER 
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
/****** Object:  Table [dbo].[Bao]    Script Date: 02/05/2018 08:31:19 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Bao](
	[maBao] [nvarchar](50) NOT NULL,
	[tenBao] [nvarchar](50) NULL,
	[chuKyXuatBan] [int] NULL,
	[donGia] [int] NULL,
	[maNhaXuatBan] [nvarchar](50) NULL,
	[imgBao] [nvarchar](50) NULL,
 CONSTRAINT [PK_Bao] PRIMARY KEY CLUSTERED 
(
	[maBao] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
INSERT [dbo].[Bao] ([maBao], [tenBao], [chuKyXuatBan], [donGia], [maNhaXuatBan], [imgBao]) VALUES (N'bao001', N'Tuổi trẻ', 10, 20000, NULL, N'images/tuoitre.png')
INSERT [dbo].[Bao] ([maBao], [tenBao], [chuKyXuatBan], [donGia], [maNhaXuatBan], [imgBao]) VALUES (N'bao002', N'Thanh niên', 5, 10000, NULL, N'images/tuoitre.png')
INSERT [dbo].[Bao] ([maBao], [tenBao], [chuKyXuatBan], [donGia], [maNhaXuatBan], [imgBao]) VALUES (N'bao003', N'Công An', 6, 20000, NULL, N'images/tuoitre.png')
INSERT [dbo].[Bao] ([maBao], [tenBao], [chuKyXuatBan], [donGia], [maNhaXuatBan], [imgBao]) VALUES (N'bao004', N'Nhi Đồng', 7, 30000, NULL, N'images/tuoitre.png')
USE [master]
GO
ALTER DATABASE [Nhom11_DatBaoTrucTuyen_SpringMVC] SET  READ_WRITE 
GO
