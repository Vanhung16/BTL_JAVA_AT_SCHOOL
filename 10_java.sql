-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th6 03, 2022 lúc 06:06 PM
-- Phiên bản máy phục vụ: 10.4.22-MariaDB
-- Phiên bản PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `10_java`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `email` char(255) NOT NULL,
  `password` char(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `admin`
--

INSERT INTO `admin` (`id`, `email`, `password`) VALUES
(3, 'hoang@haui.com', '1'),
(4, 'hung@haui.com', '1');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `giao_vien`
--

CREATE TABLE `giao_vien` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `phone` char(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `giao_vien`
--

INSERT INTO `giao_vien` (`id`, `name`, `address`, `phone`) VALUES
(1, 'Nguyễn Văn Hùng', 'Hà Nội', '033333333'),
(2, 'Đoàn Quốc Cường', 'Thái Bình', '033333222'),
(3, 'Nguyễn Xuân Hoàng', 'Bắc Giang', '033222333');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khoa`
--

CREATE TABLE `khoa` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `khoa`
--

INSERT INTO `khoa` (`id`, `name`) VALUES
(1, 'CÔNG NGHỆ THÔNG TIN'),
(2, 'QUẢN TRỊ KINH DOANH'),
(3, 'DU LICH'),
(4, 'ĐIỆN TỬ VIỄN THÔNG');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `mon_hoc`
--

CREATE TABLE `mon_hoc` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `so_tin_chi` int(11) NOT NULL,
  `id_nhom` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `mon_hoc`
--

INSERT INTO `mon_hoc` (`id`, `name`, `so_tin_chi`, `id_nhom`) VALUES
(1, 'Cơ sở dữ liệu', 3, 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhom_mon`
--

CREATE TABLE `nhom_mon` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `nhom_mon`
--

INSERT INTO `nhom_mon` (`id`, `name`) VALUES
(1, 'Lập trình căn bản'),
(2, 'Lập trình nâng cao'),
(3, 'Lập trình chuyên sâu'),
(4, 'Khoa học xã hội'),
(5, 'Khoa học tự nhiên'),
(6, 'Khoa học cơ bản');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `sinh_vien`
--

CREATE TABLE `sinh_vien` (
  `id` int(11) NOT NULL,
  `code` char(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `nien_khoa` varchar(255) NOT NULL,
  `password` char(255) NOT NULL,
  `id_khoa` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `sinh_vien`
--

INSERT INTO `sinh_vien` (`id`, `code`, `name`, `nien_khoa`, `password`, `id_khoa`) VALUES
(3, '2019605000', 'NGUYỄN XUÂN HOÀNG', 'K14', '1', 1),
(4, '2019605562', 'NGUYỄN VĂN HÙNG', 'K14', '1', 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tkb_mh`
--

CREATE TABLE `tkb_mh` (
  `id` int(11) NOT NULL,
  `id_mon_hoc` int(11) NOT NULL,
  `min_sv` int(11) NOT NULL,
  `max_sv` int(11) NOT NULL,
  `time_start` date NOT NULL,
  `so_phong` varchar(255) NOT NULL,
  `id_giao_vien` int(11) NOT NULL,
  `so_tuan_hoc` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tkb_sv`
--

CREATE TABLE `tkb_sv` (
  `id` int(11) NOT NULL,
  `id_sv` int(11) NOT NULL,
  `id_mon_hoc` int(11) NOT NULL,
  `thu` varchar(255) NOT NULL,
  `time_start` datetime NOT NULL,
  `so_tiet` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `giao_vien`
--
ALTER TABLE `giao_vien`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `khoa`
--
ALTER TABLE `khoa`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `mon_hoc`
--
ALTER TABLE `mon_hoc`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_nhom` (`id_nhom`);

--
-- Chỉ mục cho bảng `nhom_mon`
--
ALTER TABLE `nhom_mon`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `sinh_vien`
--
ALTER TABLE `sinh_vien`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_khoa` (`id_khoa`);

--
-- Chỉ mục cho bảng `tkb_mh`
--
ALTER TABLE `tkb_mh`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_giao_vien` (`id_giao_vien`),
  ADD KEY `id_mon_hoc` (`id_mon_hoc`);

--
-- Chỉ mục cho bảng `tkb_sv`
--
ALTER TABLE `tkb_sv`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_sv` (`id_sv`),
  ADD KEY `id_mon_hoc` (`id_mon_hoc`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT cho bảng `giao_vien`
--
ALTER TABLE `giao_vien`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT cho bảng `khoa`
--
ALTER TABLE `khoa`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT cho bảng `mon_hoc`
--
ALTER TABLE `mon_hoc`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT cho bảng `nhom_mon`
--
ALTER TABLE `nhom_mon`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT cho bảng `sinh_vien`
--
ALTER TABLE `sinh_vien`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT cho bảng `tkb_mh`
--
ALTER TABLE `tkb_mh`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `tkb_sv`
--
ALTER TABLE `tkb_sv`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `mon_hoc`
--
ALTER TABLE `mon_hoc`
  ADD CONSTRAINT `mon_hoc_ibfk_1` FOREIGN KEY (`id_nhom`) REFERENCES `nhom_mon` (`id`);

--
-- Các ràng buộc cho bảng `sinh_vien`
--
ALTER TABLE `sinh_vien`
  ADD CONSTRAINT `sinh_vien_ibfk_1` FOREIGN KEY (`id_khoa`) REFERENCES `khoa` (`id`);

--
-- Các ràng buộc cho bảng `tkb_mh`
--
ALTER TABLE `tkb_mh`
  ADD CONSTRAINT `tkb_mh_ibfk_1` FOREIGN KEY (`id_giao_vien`) REFERENCES `giao_vien` (`id`),
  ADD CONSTRAINT `tkb_mh_ibfk_2` FOREIGN KEY (`id_mon_hoc`) REFERENCES `mon_hoc` (`id`);

--
-- Các ràng buộc cho bảng `tkb_sv`
--
ALTER TABLE `tkb_sv`
  ADD CONSTRAINT `tkb_sv_ibfk_1` FOREIGN KEY (`id_sv`) REFERENCES `sinh_vien` (`id`),
  ADD CONSTRAINT `tkb_sv_ibfk_2` FOREIGN KEY (`id_mon_hoc`) REFERENCES `mon_hoc` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
