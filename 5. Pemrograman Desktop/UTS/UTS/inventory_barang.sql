-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 01 Jul 2021 pada 11.23
-- Versi server: 10.4.19-MariaDB
-- Versi PHP: 7.3.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `inventory_barang`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `inventory_barang_keluar`
--

CREATE TABLE `inventory_barang_keluar` (
  `Kd_barang` int(10) NOT NULL,
  `Nama_barang` varchar(25) NOT NULL,
  `Tanggal_Masuk` date NOT NULL,
  `Tanggal_Keluar` date NOT NULL,
  `Jumlah` int(11) NOT NULL,
  `Kondisi` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `inventory_barang_keluar`
--

INSERT INTO `inventory_barang_keluar` (`Kd_barang`, `Nama_barang`, `Tanggal_Masuk`, `Tanggal_Keluar`, `Jumlah`, `Kondisi`) VALUES
(12, 'a', '2020-03-20', '2020-04-30', 5, 'Baik');

-- --------------------------------------------------------

--
-- Struktur dari tabel `inventory_barang_masuk`
--

CREATE TABLE `inventory_barang_masuk` (
  `Kd_barang` int(10) NOT NULL,
  `Nama_barang` varchar(25) NOT NULL,
  `Tanggal_Masuk` date NOT NULL,
  `Jumlah` int(10) NOT NULL,
  `Kondisi` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `inventory_barang_masuk`
--

INSERT INTO `inventory_barang_masuk` (`Kd_barang`, `Nama_barang`, `Tanggal_Masuk`, `Jumlah`, `Kondisi`) VALUES
(1, 'aim', '2020-02-02', 2, 'Baik'),
(2, 'sda', '2021-05-03', 4, 'Baik');

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`id`, `username`, `password`) VALUES
(1, 'alya', 'alya');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `inventory_barang_masuk`
--
ALTER TABLE `inventory_barang_masuk`
  ADD PRIMARY KEY (`Kd_barang`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
