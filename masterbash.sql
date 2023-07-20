-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-07-2023 a las 03:23:48
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `masterbash`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `condicionmant`
--

CREATE TABLE `condicionmant` (
  `IdCondicionMant` int(11) NOT NULL,
  `TolvaRPM` double NOT NULL,
  `TornilloRPM` double NOT NULL,
  `Presion` double NOT NULL,
  `Amperaje` double NOT NULL,
  `Vacio` double NOT NULL,
  `Rendimiento` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `condicionmant`
--

INSERT INTO `condicionmant` (`IdCondicionMant`, `TolvaRPM`, `TornilloRPM`, `Presion`, `Amperaje`, `Vacio`, `Rendimiento`) VALUES
(1, 12, 12, 12, 12, 12, 12),
(2, 1, 2, 3, 4, 5, 6),
(3, 1, 1, 2, 2, 3, 4),
(4, 1, 1, 1, 1, 1, 1),
(5, 123, 123, 123, 123, 123, 123),
(6, 1, 1, 2, 2, 2, 2),
(7, 2, 3, 3, 233, 33, 3),
(8, 22, 33, 33, 22, 22, 22),
(9, 2, 2, 2, 2, 2, 2),
(10, 1, 1, 1, 1, 1, 1),
(11, 2, 21, 1, 1, 21, 12),
(12, 6, 6, 6, 6, 6, 6);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `formula`
--

CREATE TABLE `formula` (
  `idFormula` int(11) NOT NULL,
  `codigo` int(11) NOT NULL,
  `producto` varchar(45) NOT NULL,
  `insumo1` varchar(45) NOT NULL,
  `cantidad1` double NOT NULL,
  `insumo2` varchar(45) NOT NULL,
  `cantidad2` double NOT NULL,
  `insumo3` varchar(45) NOT NULL,
  `cantidad3` double NOT NULL,
  `insumo4` varchar(45) NOT NULL,
  `cantidad4` double NOT NULL,
  `insumo5` varchar(45) NOT NULL,
  `cantidad5` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `formula`
--

INSERT INTO `formula` (`idFormula`, `codigo`, `producto`, `insumo1`, `cantidad1`, `insumo2`, `cantidad2`, `insumo3`, `cantidad3`, `insumo4`, `cantidad4`, `insumo5`, `cantidad5`) VALUES
(48, 10001, 'verde', 'insumo', 0.12, 'insumo Base', 0.24, 'insumo', 0.34, 'insumo', 0.15, 'insumo', 0.15),
(51, 10019, 'Rojo', 'insumo', 0.12, 'insumo', 0.24, 'insumo', 0.34, 'insumo', 0.2, 'insumo', 0.1),
(53, 100111, 'verde', 'insumo', 0.12, 'insumo Base', 0.24, 'insumo', 0.34, 'insumo', 0.15, 'insumo', 0.15),
(54, 1010, 'naranja', 'insumo', 0.12, 'insumo Base', 0.24, 'insumo', 0.34, 'insumo', 0.15, 'insumo', 0.15),
(57, 10011, 'verde', 'insumo', 0.12, 'insumo Base', 0.24, 'insumo', 0.34, 'insumo', 0.15, 'insumo', 0.15),
(58, 1018, 'naranja', 'insumo Escencial', 0.12, 'insumo Base', 0.24, 'insumo', 0.34, 'insumo', 0.15, 'insumo', 0.15);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `formulacion`
--

CREATE TABLE `formulacion` (
  `idFormula` int(11) NOT NULL,
  `codigo` int(11) NOT NULL,
  `producto` varchar(45) NOT NULL,
  `insumo1` varchar(45) NOT NULL,
  `cantidad1` double NOT NULL,
  `insumo2` varchar(45) NOT NULL,
  `cantidad2` double NOT NULL,
  `insumo3` varchar(45) NOT NULL,
  `cantidad3` double NOT NULL,
  `insumo4` varchar(45) NOT NULL,
  `cantidad4` double NOT NULL,
  `insumo5` varchar(45) NOT NULL,
  `cantidad5` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `formulacion`
--

INSERT INTO `formulacion` (`idFormula`, `codigo`, `producto`, `insumo1`, `cantidad1`, `insumo2`, `cantidad2`, `insumo3`, `cantidad3`, `insumo4`, `cantidad4`, `insumo5`, `cantidad5`) VALUES
(1, 12, 'asd', 'a', 1, 'b', 2, 'c', 3, 'd', 4, '3', 5),
(4, 12, 'asda', 'a', 1, 'b', 2, 'c', 3, 'd', 4, '3', 5),
(5, 12124, 'asda', 'a', 1, 'b', 2, 'c', 3, 'd', 4, '3', 5),
(6, 12124, 'asdaggggggg', 'a', 1, 'b', 2, 'c', 3, 'd', 4, '3', 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `orden`
--

CREATE TABLE `orden` (
  `idOrden` int(11) NOT NULL,
  `idFormula` int(11) NOT NULL,
  `nof` int(11) NOT NULL,
  `real1` double NOT NULL,
  `real2` double NOT NULL,
  `real3` double NOT NULL,
  `real4` double NOT NULL,
  `real5` double NOT NULL,
  `cantidad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `orden`
--

INSERT INTO `orden` (`idOrden`, `idFormula`, `nof`, `real1`, `real2`, `real3`, `real4`, `real5`, `cantidad`) VALUES
(67498, 123, 12, 123, 123, 123, 123, 123, 0),
(67499, 10001, 321, 0.24, 0.48, 0.68, 0.3, 0.3, 0),
(67500, 10019, 1, 0.24, 0.48, 0.68, 0.4, 0.2, 2),
(67501, 10001, 12, 0.36, 0.72, 1.02, 0.44999999999999996, 0.44999999999999996, 3),
(67502, 10001, 1, 0.12, 0.24, 0.34, 0.15, 0.15, 1),
(67503, 10001, 2, 0.12, 0.24, 0.34, 0.15, 0.15, 1),
(67504, 10019, 123132213, 0.6, 1.2, 1.7000000000000002, 1, 0.5, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idProducto` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `cantProd` int(11) NOT NULL,
  `idOrden` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idProducto`, `nombre`, `cantProd`, `idOrden`) VALUES
(1001260, 'ATIQPLUS AMARILLO 123', 600, '67498');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `zonas`
--

CREATE TABLE `zonas` (
  `idzonas` int(11) NOT NULL,
  `z1` double NOT NULL,
  `z2` double NOT NULL,
  `z3` double NOT NULL,
  `z4` double NOT NULL,
  `z5` double NOT NULL,
  `z6` double NOT NULL,
  `z7` double NOT NULL,
  `z8` double NOT NULL,
  `z9` double NOT NULL,
  `z10` double NOT NULL,
  `z11` double NOT NULL,
  `z12` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `zonas`
--

INSERT INTO `zonas` (`idzonas`, `z1`, `z2`, `z3`, `z4`, `z5`, `z6`, `z7`, `z8`, `z9`, `z10`, `z11`, `z12`) VALUES
(1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12),
(2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
(3, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
(4, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3),
(5, 1, 0, 2, 3, 22, 2, 2, 2, 2, 2, 1, 1),
(6, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
(7, 1, 11, 1, 111, 11, 11, 1, 1, 2, 3, 23, 3),
(8, 98, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8),
(9, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(10, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `condicionmant`
--
ALTER TABLE `condicionmant`
  ADD PRIMARY KEY (`IdCondicionMant`);

--
-- Indices de la tabla `formula`
--
ALTER TABLE `formula`
  ADD PRIMARY KEY (`idFormula`),
  ADD UNIQUE KEY `codigo` (`codigo`),
  ADD UNIQUE KEY `codigo_2` (`codigo`);

--
-- Indices de la tabla `formulacion`
--
ALTER TABLE `formulacion`
  ADD PRIMARY KEY (`idFormula`);

--
-- Indices de la tabla `orden`
--
ALTER TABLE `orden`
  ADD PRIMARY KEY (`idOrden`),
  ADD KEY `idFormula` (`idFormula`);

--
-- Indices de la tabla `zonas`
--
ALTER TABLE `zonas`
  ADD PRIMARY KEY (`idzonas`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `condicionmant`
--
ALTER TABLE `condicionmant`
  MODIFY `IdCondicionMant` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `formula`
--
ALTER TABLE `formula`
  MODIFY `idFormula` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=60;

--
-- AUTO_INCREMENT de la tabla `formulacion`
--
ALTER TABLE `formulacion`
  MODIFY `idFormula` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `orden`
--
ALTER TABLE `orden`
  MODIFY `idOrden` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=67505;

--
-- AUTO_INCREMENT de la tabla `zonas`
--
ALTER TABLE `zonas`
  MODIFY `idzonas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
