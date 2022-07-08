-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.7.33 - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             11.2.0.6213
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- Dumping structure for table toko_sepatu.tb_barang
CREATE TABLE IF NOT EXISTS `tb_barang` (
  `id` varchar(6) NOT NULL,
  `nama_barang` varchar(50) DEFAULT NULL,
  `id_merk` int(3) NOT NULL,
  `id_kategori` int(3) NOT NULL,
  `ukuran` int(3) NOT NULL,
  `harga_beli` double NOT NULL DEFAULT '0',
  `harga_jual` double NOT NULL DEFAULT '0',
  `keterangan` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_tb_barang_tb_kategori` (`id_kategori`),
  KEY `FK_tb_barang_tb_merk` (`id_merk`),
  CONSTRAINT `FK_tb_barang_tb_kategori` FOREIGN KEY (`id_kategori`) REFERENCES `tb_kategori` (`id`) ON UPDATE CASCADE,
  CONSTRAINT `FK_tb_barang_tb_merk` FOREIGN KEY (`id_merk`) REFERENCES `tb_merk` (`id`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table toko_sepatu.tb_barang: ~8 rows (approximately)
/*!40000 ALTER TABLE `tb_barang` DISABLE KEYS */;
INSERT INTO `tb_barang` (`id`, `nama_barang`, `id_merk`, `id_kategori`, `ukuran`, `harga_beli`, `harga_jual`, `keterangan`) VALUES
	('ad2312', 'Adidas Running Sport', 2, 2, 42, 1200000, 1400000, '10'),
	('ad890', 'Adidas Superstars Full White', 2, 3, 42, 1100000, 1300000, '25'),
	('nk2199', 'Nike Air Jordan', 1, 1, 41, 3200000, 3500000, '15'),
	('nk768', 'NIKE W ZOOM VISTA GRIND SP-LIME BLAST/BLACK-SKY', 1, 1, 41, 2390000, 2600000, '10'),
	('pm3130', 'Puma Future Sport', 3, 2, 40, 2700000, 2900000, '10'),
	('vn345', 'Vans Comfyfush Oldskool Black & White', 4, 1, 43, 1200000, 1500000, '30'),
	('vns54', 'Vans Slip On Marshmello', 4, 3, 40, 1000000, 1200000, '40'),
	('vs870', 'Vans Aunthentic White', 1, 1, 43, 1400000, 1700000, '30');
/*!40000 ALTER TABLE `tb_barang` ENABLE KEYS */;

-- Dumping structure for table toko_sepatu.tb_gaji_karyawan
CREATE TABLE IF NOT EXISTS `tb_gaji_karyawan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bagian` varchar(20) NOT NULL,
  `gaji` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- Dumping data for table toko_sepatu.tb_gaji_karyawan: ~4 rows (approximately)
/*!40000 ALTER TABLE `tb_gaji_karyawan` DISABLE KEYS */;
INSERT INTO `tb_gaji_karyawan` (`id`, `bagian`, `gaji`) VALUES
	(1, 'Manager', 4000000),
	(2, 'Kasir', 2500000),
	(3, 'Costumer Service', 2000000),
	(4, 'Gudang', 3000000);
/*!40000 ALTER TABLE `tb_gaji_karyawan` ENABLE KEYS */;

-- Dumping structure for table toko_sepatu.tb_karyawan
CREATE TABLE IF NOT EXISTS `tb_karyawan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nik` varchar(16) DEFAULT NULL,
  `nama` varchar(30) NOT NULL DEFAULT '',
  `alamat` varchar(100) NOT NULL DEFAULT '',
  `tgl_lahir` date DEFAULT NULL,
  `telepon` varchar(13) NOT NULL DEFAULT '',
  `jenis_kelamin` varchar(7) DEFAULT NULL,
  `jabatan` int(11) DEFAULT NULL,
  `foto` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `nik` (`nik`),
  KEY `FK_tb_karyawan_tb_gaji_karyawan` (`jabatan`),
  CONSTRAINT `FK_tb_karyawan_tb_gaji_karyawan` FOREIGN KEY (`jabatan`) REFERENCES `tb_gaji_karyawan` (`id`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1013 DEFAULT CHARSET=utf8;

-- Dumping data for table toko_sepatu.tb_karyawan: ~4 rows (approximately)
/*!40000 ALTER TABLE `tb_karyawan` DISABLE KEYS */;
INSERT INTO `tb_karyawan` (`id`, `nik`, `nama`, `alamat`, `tgl_lahir`, `telepon`, `jenis_kelamin`, `jabatan`, `foto`) VALUES
	(1001, '202057301044', 'Rizky', 'Panggoi', '2002-06-15', '082361002021', 'Pria', 1, NULL),
	(1002, '2020573010071', 'Syah Sury alam', 'Panggoi Dusun A', '2002-10-26', '0823121', 'Pria', 2, NULL),
	(1003, '202057301187', 'Zaky Syifa', 'Panggoi', '2022-06-10', '0987788283', 'Pria', 3, NULL),
	(1012, '12132133', 'Alvin Syahri', 'Kandang', '2022-06-13', '0818727172', 'Pria', 4, NULL);
/*!40000 ALTER TABLE `tb_karyawan` ENABLE KEYS */;

-- Dumping structure for table toko_sepatu.tb_kategori
CREATE TABLE IF NOT EXISTS `tb_kategori` (
  `id` int(3) NOT NULL AUTO_INCREMENT,
  `kategori` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Dumping data for table toko_sepatu.tb_kategori: ~3 rows (approximately)
/*!40000 ALTER TABLE `tb_kategori` DISABLE KEYS */;
INSERT INTO `tb_kategori` (`id`, `kategori`) VALUES
	(1, 'Sneakers'),
	(2, 'Sport'),
	(3, 'Casual');
/*!40000 ALTER TABLE `tb_kategori` ENABLE KEYS */;

-- Dumping structure for table toko_sepatu.tb_merk
CREATE TABLE IF NOT EXISTS `tb_merk` (
  `id` int(3) NOT NULL AUTO_INCREMENT,
  `merk` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- Dumping data for table toko_sepatu.tb_merk: ~4 rows (approximately)
/*!40000 ALTER TABLE `tb_merk` DISABLE KEYS */;
INSERT INTO `tb_merk` (`id`, `merk`) VALUES
	(1, 'Nike'),
	(2, 'Adidas'),
	(3, 'Puma'),
	(4, 'Vans');
/*!40000 ALTER TABLE `tb_merk` ENABLE KEYS */;

-- Dumping structure for table toko_sepatu.tb_stok_barang
CREATE TABLE IF NOT EXISTS `tb_stok_barang` (
  `id_barang` varchar(6) NOT NULL,
  `stok` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_barang`) USING BTREE,
  CONSTRAINT `FK_tb_stok_barang_tb_barang` FOREIGN KEY (`id_barang`) REFERENCES `tb_barang` (`id`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table toko_sepatu.tb_stok_barang: ~0 rows (approximately)
/*!40000 ALTER TABLE `tb_stok_barang` DISABLE KEYS */;
INSERT INTO `tb_stok_barang` (`id_barang`, `stok`) VALUES
	('ad890', 25);
/*!40000 ALTER TABLE `tb_stok_barang` ENABLE KEYS */;

-- Dumping structure for table toko_sepatu.tb_transaksi
CREATE TABLE IF NOT EXISTS `tb_transaksi` (
  `id` char(36) NOT NULL,
  `tgl_transaksi` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `id_barang` varchar(6) NOT NULL,
  `qty` int(11) NOT NULL,
  `total_bayar` double NOT NULL DEFAULT '0',
  `metode_pembayaran` int(2) DEFAULT NULL,
  `status` int(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`,`tgl_transaksi`,`id_barang`),
  KEY `FK_tb_transaksi_tb_barang` (`id_barang`),
  CONSTRAINT `FK_tb_transaksi_tb_barang` FOREIGN KEY (`id_barang`) REFERENCES `tb_barang` (`id`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table toko_sepatu.tb_transaksi: ~14 rows (approximately)
/*!40000 ALTER TABLE `tb_transaksi` DISABLE KEYS */;
INSERT INTO `tb_transaksi` (`id`, `tgl_transaksi`, `id_barang`, `qty`, `total_bayar`, `metode_pembayaran`, `status`) VALUES
	('1411f366-7c17-4e18-931d-c6ce3561dfec', '2022-06-16 11:38:29', 'ad2312', 1, 1400000, 1, 2),
	('155819ee-a4d4-432f-843a-90f2384c0280', '2022-06-16 10:55:50', 'ad2312', 1, 400000, 1, 1),
	('69e8d578-f896-49ba-b04d-cbbe80896cb8', '2022-06-16 10:46:45', 'ad2312', 2, 800000, 1, 2),
	('6f91c3d1-7abb-4811-94ab-a39ba7ee8936', '2022-06-16 10:54:32', 'pm3130', 1, 300000, 1, 2),
	('71428b44-c3b1-4eb1-829f-68c78bf35a7d', '2022-06-16 12:17:23', 'nk2199', 1, 3500000, 1, 2),
	('71428b44-c3b1-4eb1-829f-68c78bf35a7d', '2022-06-16 12:17:23', 'vn345', 2, 3000000, 1, 2),
	('891d6e5a-984c-4ac8-a6f5-dbfbe33df30b', '2022-06-16 10:48:35', 'ad2312', 1, 400000, 1, 2),
	('bc04ad07-043a-450f-893a-86a97c3125af', '2022-06-16 10:52:38', 'ad2312', 1, 400000, 1, 2),
	('bc04ad07-043a-450f-893a-86a97c3125af', '2022-06-16 10:52:38', 'pm3130', 2, 600000, 1, 2),
	('d1093b7d-d353-4e74-a10f-94b11ee61e4b', '2022-06-16 10:50:41', 'ad2312', 1, 400000, 1, 2),
	('ec9c254a-5e4e-4df5-a931-8085357e6aa0', '2022-06-16 11:35:26', 'nk2199', 2, 7000000, 1, 2),
	('ec9c254a-5e4e-4df5-a931-8085357e6aa0', '2022-06-16 11:35:26', 'pm3130', 1, 2900000, 1, 2),
	('f6b4ea89-3dbe-4f57-94d5-b0d4ca822eb2', '2022-06-16 11:39:24', 'ad890', 1, 1300000, 1, 2),
	('f80192c6-6bf2-4857-8ba2-fb64dcda3c5a', '2022-06-16 10:53:58', 'ad2312', 1, 400000, 1, 2);
/*!40000 ALTER TABLE `tb_transaksi` ENABLE KEYS */;

-- Dumping structure for table toko_sepatu.tb_users
CREATE TABLE IF NOT EXISTS `tb_users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(16) NOT NULL,
  `id_karyawan` int(11) NOT NULL,
  `password` varchar(255) NOT NULL,
  `level` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`),
  KEY `FK_tb_users_tb_karyawan` (`id_karyawan`),
  CONSTRAINT `FK_tb_users_tb_karyawan` FOREIGN KEY (`id_karyawan`) REFERENCES `tb_karyawan` (`id`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- Dumping data for table toko_sepatu.tb_users: ~4 rows (approximately)
/*!40000 ALTER TABLE `tb_users` DISABLE KEYS */;
INSERT INTO `tb_users` (`id`, `username`, `id_karyawan`, `password`, `level`) VALUES
	(1, 'rizky', 1001, '1234', 1),
	(2, 'sury', 1002, '4321', 2),
	(3, 'zaky', 1003, '123', 3),
	(4, 'alvin', 1012, 'qwert', 2);
/*!40000 ALTER TABLE `tb_users` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
