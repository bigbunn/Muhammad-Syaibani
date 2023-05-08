-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 16, 2021 at 11:13 AM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 8.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `perpustakaan`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(3) NOT NULL,
  `user` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `user`, `password`) VALUES
(1, '�ÞT�q��GcN-', 'E�w�SBVk�T���'),
(2, '�\n��� �z7��t���', '�\n��� �z7��t���'),
(3, '���3��pp�/��<�', '���3��pp�/��<�'),
(4, '�;#�iS����R���ɥ', '�;#�iS����R���ɥ'),
(5, 'Y�Wg��k�t�{�p@', 'Y�Wg��k�t�{�p@');

-- --------------------------------------------------------

--
-- Table structure for table `dataanggota`
--

CREATE TABLE `dataanggota` (
  `NPM` varchar(10) NOT NULL,
  `Nama` varchar(100) NOT NULL,
  `TempatLahir` varchar(100) NOT NULL,
  `TanggalLahir` date NOT NULL,
  `Prodi` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dataanggota`
--

INSERT INTO `dataanggota` (`NPM`, `Nama`, `TempatLahir`, `TanggalLahir`, `Prodi`) VALUES
('1817101379', 'Aimansa', 'Banjarmasin', '2021-08-16', 'Rekayasa Kriptografi');

-- --------------------------------------------------------

--
-- Table structure for table `databuku`
--

CREATE TABLE `databuku` (
  `KodeBuku` int(3) NOT NULL,
  `JudulBuku` varchar(100) NOT NULL,
  `Jenis` varchar(100) NOT NULL,
  `TglTerbit` date NOT NULL,
  `Pengarang` varchar(100) NOT NULL,
  `StokBuku` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `databuku`
--

INSERT INTO `databuku` (`KodeBuku`, `JudulBuku`, `Jenis`, `TglTerbit`, `Pengarang`, `StokBuku`) VALUES
(1, 'Buku Saku', 'Pembinaan', '2021-08-16', 'Ai', 3);

-- --------------------------------------------------------

--
-- Table structure for table `peminjaman`
--

CREATE TABLE `peminjaman` (
  `KodePeminjaman` int(3) NOT NULL,
  `NPM` varchar(10) NOT NULL,
  `Nama` varchar(100) NOT NULL,
  `Prodi` varchar(100) NOT NULL,
  `KodeBuku` int(3) NOT NULL,
  `JudulBuku` varchar(100) NOT NULL,
  `TanggalPeminjaman` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `peminjaman`
--

INSERT INTO `peminjaman` (`KodePeminjaman`, `NPM`, `Nama`, `Prodi`, `KodeBuku`, `JudulBuku`, `TanggalPeminjaman`) VALUES
(30, '1817101379', 'Aimansa', 'Rekayasa Kriptografi', 1, 'Buku Saku', '2021-08-16');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `dataanggota`
--
ALTER TABLE `dataanggota`
  ADD PRIMARY KEY (`NPM`);

--
-- Indexes for table `databuku`
--
ALTER TABLE `databuku`
  ADD PRIMARY KEY (`KodeBuku`);

--
-- Indexes for table `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD PRIMARY KEY (`KodePeminjaman`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `databuku`
--
ALTER TABLE `databuku`
  MODIFY `KodeBuku` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `peminjaman`
--
ALTER TABLE `peminjaman`
  MODIFY `KodePeminjaman` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
