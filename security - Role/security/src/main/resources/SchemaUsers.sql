-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 11, 2025 at 01:39 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `security`
--

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` bigint(20) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `password`, `role`, `username`) VALUES
(1, '$2a$10$w27e8SKip91BPpCYoy0qUuiu.BGu6apQZqjh7fc921/6XBMb0E4w2', 'ROLE_ADMIN', 'admin01'), --password: admin01
(2, '$2a$10$nnbRKGRWjQxtmukjEp5LF.CTqf1tBnjB3Tbyjg.RCNBnQR5amDe4S', 'ROLE_ADMIN', 'admin02'), --password: admin02
(3, '$2a$10$eH9k4B9SxKjpTiEvWa/Ws.vyTXaD7N5RuAGPrVZOA6iRY6ocQme7W', 'ROLE_USER', 'user01'), --password: user01
(4, '$2a$10$YTwxRRQRwIDp69VVerRA4OuQXHxhVEn3HJAIoZRJN6EPNitsTJZ6y', 'ROLE_USER', 'user02'), --password: user02
(5, '$2a$10$Qs50kHAOvnj2gVlJ6SIHEev9/4mK56FmuJkOkns/WIT5Z1f9bI.nC', 'ROLE_USER', 'user03'); --password: user03

--
-- Indexes for dumped tables
--

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
