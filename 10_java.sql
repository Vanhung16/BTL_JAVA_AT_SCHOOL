-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 04, 2022 at 04:18 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `10_java`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `email` char(255) NOT NULL,
  `password` char(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `name`, `email`, `password`) VALUES
(3, 'Hoang Admin', 'hoang@haui.com', '1'),
(4, 'Hung Admin', 'hung@haui.com', '1');

-- --------------------------------------------------------

--
-- Table structure for table `giao_vien`
--

CREATE TABLE `giao_vien` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `phone` char(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `giao_vien`
--

INSERT INTO `giao_vien` (`id`, `name`, `address`, `phone`) VALUES
(1, 'Nguyễn Văn Hùng', 'Hà Nội', '033333333'),
(2, 'Đoàn Quốc Cường', 'Thái Bình', '033333222'),
(3, 'Nguyễn Xuân Hoàng', 'Bắc Giang', '033222333');

-- --------------------------------------------------------

--
-- Table structure for table `khoa`
--

CREATE TABLE `khoa` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `khoa`
--

INSERT INTO `khoa` (`id`, `name`) VALUES
(1, 'CÔNG NGHỆ THÔNG TIN'),
(2, 'QUẢN TRỊ KINH DOANH'),
(3, 'DU LICH'),
(4, 'ĐIỆN TỬ VIỄN THÔNG'),
(25, 'Điện'),
(27, 'Khoa học máy tính');

-- --------------------------------------------------------

--
-- Table structure for table `mon_hoc`
--

CREATE TABLE `mon_hoc` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `so_tin_chi` int(11) NOT NULL,
  `id_nhom` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mon_hoc`
--

INSERT INTO `mon_hoc` (`id`, `name`, `so_tin_chi`, `id_nhom`) VALUES
(1, 'Cơ sở dữ liệu', 3, 1);

-- --------------------------------------------------------

--
-- Table structure for table `nhom_mon`
--

CREATE TABLE `nhom_mon` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `nhom_mon`
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
-- Table structure for table `sinh_vien`
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
-- Dumping data for table `sinh_vien`
--

INSERT INTO `sinh_vien` (`id`, `code`, `name`, `nien_khoa`, `password`, `id_khoa`) VALUES
(3, '2019605000', 'NGUYỄN XUÂN HOÀNG', 'K14', '1', 1),
(4, '2019605562', 'NGUYỄN VĂN HÙNG', 'K14', '1', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tkb_mh`
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
-- Table structure for table `tkb_sv`
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
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `giao_vien`
--
ALTER TABLE `giao_vien`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `khoa`
--
ALTER TABLE `khoa`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `mon_hoc`
--
ALTER TABLE `mon_hoc`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_nhom` (`id_nhom`);

--
-- Indexes for table `nhom_mon`
--
ALTER TABLE `nhom_mon`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `sinh_vien`
--
ALTER TABLE `sinh_vien`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_khoa` (`id_khoa`);

--
-- Indexes for table `tkb_mh`
--
ALTER TABLE `tkb_mh`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_giao_vien` (`id_giao_vien`),
  ADD KEY `id_mon_hoc` (`id_mon_hoc`);

--
-- Indexes for table `tkb_sv`
--
ALTER TABLE `tkb_sv`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_sv` (`id_sv`),
  ADD KEY `id_mon_hoc` (`id_mon_hoc`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `giao_vien`
--
ALTER TABLE `giao_vien`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `khoa`
--
ALTER TABLE `khoa`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT for table `mon_hoc`
--
ALTER TABLE `mon_hoc`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `nhom_mon`
--
ALTER TABLE `nhom_mon`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `sinh_vien`
--
ALTER TABLE `sinh_vien`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `tkb_mh`
--
ALTER TABLE `tkb_mh`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tkb_sv`
--
ALTER TABLE `tkb_sv`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `mon_hoc`
--
ALTER TABLE `mon_hoc`
  ADD CONSTRAINT `mon_hoc_ibfk_1` FOREIGN KEY (`id_nhom`) REFERENCES `nhom_mon` (`id`);

--
-- Constraints for table `sinh_vien`
--
ALTER TABLE `sinh_vien`
  ADD CONSTRAINT `sinh_vien_ibfk_1` FOREIGN KEY (`id_khoa`) REFERENCES `khoa` (`id`);

--
-- Constraints for table `tkb_mh`
--
ALTER TABLE `tkb_mh`
  ADD CONSTRAINT `tkb_mh_ibfk_1` FOREIGN KEY (`id_giao_vien`) REFERENCES `giao_vien` (`id`),
  ADD CONSTRAINT `tkb_mh_ibfk_2` FOREIGN KEY (`id_mon_hoc`) REFERENCES `mon_hoc` (`id`);

--
-- Constraints for table `tkb_sv`
--
ALTER TABLE `tkb_sv`
  ADD CONSTRAINT `tkb_sv_ibfk_1` FOREIGN KEY (`id_sv`) REFERENCES `sinh_vien` (`id`),
  ADD CONSTRAINT `tkb_sv_ibfk_2` FOREIGN KEY (`id_mon_hoc`) REFERENCES `mon_hoc` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
