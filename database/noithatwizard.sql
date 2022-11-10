-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th10 10, 2022 lúc 06:35 AM
-- Phiên bản máy phục vụ: 10.4.25-MariaDB
-- Phiên bản PHP: 7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `noithatwizard`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chucvu`
--

CREATE TABLE `chucvu` (
  `MaCV` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `TenCV` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Luong` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `chucvu`
--

INSERT INTO `chucvu` (`MaCV`, `TenCV`, `Luong`) VALUES
('CV01', 'Quản Lý', 15000000),
('CV02', 'Nhân Viên Thu Ngân', 8500000),
('CV03', 'Kế Toán', 10000000),
('CV04', 'Nhân Viên Kho', 9000000);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `cthoadon`
--

CREATE TABLE `cthoadon` (
  `MaHD` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MaSP` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `TenSP` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `SoLuong` int(20) NOT NULL,
  `DonGia` int(20) NOT NULL,
  `ThanhTien` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `cthoadon`
--

INSERT INTO `cthoadon` (`MaHD`, `MaSP`, `TenSP`, `SoLuong`, `DonGia`, `ThanhTien`) VALUES
('HD12', 'SP05', 'Bàn làm việc Pio', 1, 13650000, 13650000),
('HD13', 'SP03', 'Bàn làm việc Osaka', 4, 22900000, 91600000),
('HD13', 'SP04', 'Bàn làm việc Osaka KA', 3, 48900000, 146700000),
('HD13', 'SP05', 'Bàn làm việc Pio', 4, 13650000, 54600000);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hoadon`
--

CREATE TABLE `hoadon` (
  `MaHD` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MaKH` varchar(15) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `MaNV` varchar(15) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `NgayLap` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `TongTien` int(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `hoadon`
--

INSERT INTO `hoadon` (`MaHD`, `MaKH`, `MaNV`, `NgayLap`, `TongTien`) VALUES
('HD01', 'KH02', 'NV04', '10/11/2022', 250200000),
('HD02', 'KH01', 'NV01', '10/11/2022', 195600000),
('HD03', 'KH03', 'NV03', '10/11/2022', 68250000),
('HD04', 'HD04', 'NV03', '10/11/2022', 195600000),
('HD05', 'KH05', 'NV05', '10/11/2022', 293400000),
('HD06', 'KH06', 'NV06', '10/11/2022', 27300000),
('HD07', 'KH07', 'NV07', '10/11/2022', 97800000),
('HD08', 'KM08', 'NV08', '10/11/2022', 13650000),
('HD09', 'KH09', 'NV09', '10/11/2022', 48900000),
('HD10', 'KH10', 'NV10', '10/11/2022', 13650000),
('HD11', 'KH11', 'NV11', '10/11/2022', 13650000),
('HD12', 'KH12', 'NV12', '10/11/2022', 13650000),
('HD13', 'KH13', 'NV13', '10/11/2022', 292900000);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khuyenmai`
--

CREATE TABLE `khuyenmai` (
  `MaKM` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `TenKM` varchar(40) COLLATE utf8mb4_unicode_ci NOT NULL,
  `PhanTramKM` int(10) NOT NULL,
  `DieuKien` int(20) NOT NULL,
  `NgayBatDau` date NOT NULL,
  `NgayKetThuc` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `khuyenmai`
--

INSERT INTO `khuyenmai` (`MaKM`, `TenKM`, `PhanTramKM`, `DieuKien`, `NgayBatDau`, `NgayKetThuc`) VALUES
('KM01', 'Giảm Giá 10%', 10, 200000, '2022-11-01', '2022-11-02'),
('KM02', 'E123', 321423, 4234, '2022-11-01', '2022-11-10');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhanvien`
--

CREATE TABLE `nhanvien` (
  `MaNV` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Ho` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Ten` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `NgaySinh` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  `GioiTinh` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `DiaChi` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `SoDT` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MaCV` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `IMG` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `nhanvien`
--

INSERT INTO `nhanvien` (`MaNV`, `Ho`, `Ten`, `NgaySinh`, `GioiTinh`, `DiaChi`, `SoDT`, `MaCV`, `IMG`) VALUES
('NV01', 'Seo', 'Eunkwang', '22/11/1990', 'Nam', 'South Korea', '22111990', 'CV01', 'Eunkwang.jpg'),
('NV02', 'Lee', 'Minhyuk', '29/11/1990', 'Nam', 'South Korea', '29111990', 'CV01', 'Minhyuk.jpg'),
('NV03', 'Shin', 'Peniel', '10/03/1993', 'Nam', 'USA', '10031993', 'CV01', 'Peniel.jpg'),
('NV04', 'Jung', 'Ilhoon', '04/10/1994', 'Nam', 'South Korea', '04101994', 'CV01', 'Ilhoon.jpg'),
('NV05', 'Lee', 'Changsub', '26/02/1991', 'Nam', 'South Korea', '26021991', 'CV01', 'Changsub.jpg'),
('NV06', 'Yook', 'Sungjae', '02/05/1995', 'Nam', 'South Korea', '02051995', 'CV01', 'Sungjae.jpg'),
('NV07', 'Im', 'Hyunsik', '07/03/1992', 'Nam', 'South Korea', '07031992', 'CV01', 'Hyunsik.jpg'),
('NV08', 'Kim', 'Dami', '09/04/1995', 'Nữ', 'South Korea', '09041995', 'CV01', 'Dami.jpg'),
('NV09', 'Choi', 'Woosik', '26/03/1990', 'Nam', 'South Korea', '26031990', 'CV01', 'Woosik.jpg'),
('NV10', 'Roh', 'Jeongeui', '31/07/2001', 'Nữ', 'South Korea', '31072001', 'CV01', 'Jeongeui.jpg'),
('NV11', 'Kim', 'Sungcheol', '31/12/1991', 'Nam', 'South Korea', '31121991', 'CV01', 'Sungcheol.jpg'),
('NV12', 'Trần Thùy', 'Chi', '04/05/1990', 'Nữ', 'Vietnam', '04051990', 'CV01', 'Chi.jpg'),
('NV13', 'Chi', 'Pu', '14/06/1993', 'Nữ', 'Vietnam', '14061993', 'CV01', 'Pu.jpg'),
('NV14', 'Jeon', 'Soyeon', '26/08/1998', 'Nữ', 'South Korea', '26081998', 'CV01', 'Soyeon.jpg'),
('NV15', 'Cho', 'Miyeon', '31/01/1997', 'Nữ', 'South Korea', '31011997', 'CV01', 'Miyeon.jpg'),
('NV16', 'Yontararak', 'Minnie', '23/10/1997', 'Nữ', 'Thailand', '23101997', 'CV01', 'Minnie.jpg'),
('NV17', 'Song', 'Yuqi', '23/09/1999', 'Nữ', 'China', '23091999', 'CV01', 'Yuqi.jpg'),
('NV18', 'Yeh', 'Shuhua', '06/01/2000', 'Nữ', 'Taiwan', '06012000', 'CV01', 'Shuhua.jpg');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `sanpham`
--

CREATE TABLE `sanpham` (
  `MaSP` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `TenSP` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `SoLuong` int(20) NOT NULL,
  `DonGia` int(20) NOT NULL,
  `DonViTinh` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MaLoai` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `IMG` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `sanpham`
--

INSERT INTO `sanpham` (`MaSP`, `TenSP`, `SoLuong`, `DonGia`, `DonViTinh`, `MaLoai`, `IMG`) VALUES
('SP01', 'Bàn làm việc Finn 260011', 0, 22900000, 'Cái', '', ''),
('SP02', 'Bàn làm việc Maxine', -25, 51940000, 'Cái', '', 'SP02.jpg'),
('SP03', 'Bàn làm việc Osaka', -24, 22900000, 'Cái', '', ''),
('SP04', 'Bàn làm việc Osaka KA', -32, 48900000, 'Cái', '', ''),
('SP05', 'Bàn làm việc Pio', -50, 13650000, 'Cái', '', 'null');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `taikhoan`
--

CREATE TABLE `taikhoan` (
  `MaNV` char(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `TenDangNhap` char(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MatKhau` char(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `PhanQuyen` char(25) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `taikhoan`
--

INSERT INTO `taikhoan` (`MaNV`, `TenDangNhap`, `MatKhau`, `PhanQuyen`) VALUES
('NV01', 'admin', '123', 'CV01'),
('NV02', 'admin1', '123456', 'CV02'),
('NV03', 'admin12345', '123456', 'CV03');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `chucvu`
--
ALTER TABLE `chucvu`
  ADD PRIMARY KEY (`MaCV`);

--
-- Chỉ mục cho bảng `cthoadon`
--
ALTER TABLE `cthoadon`
  ADD PRIMARY KEY (`MaHD`,`MaSP`);

--
-- Chỉ mục cho bảng `hoadon`
--
ALTER TABLE `hoadon`
  ADD PRIMARY KEY (`MaHD`);

--
-- Chỉ mục cho bảng `khuyenmai`
--
ALTER TABLE `khuyenmai`
  ADD PRIMARY KEY (`MaKM`);

--
-- Chỉ mục cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`MaNV`);

--
-- Chỉ mục cho bảng `sanpham`
--
ALTER TABLE `sanpham`
  ADD PRIMARY KEY (`MaSP`);

--
-- Chỉ mục cho bảng `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD PRIMARY KEY (`MaNV`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
