-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 13-07-2023 a las 05:39:34
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

CREATE DATABASE masterbash;

use masterbash;

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
-- Estructura de tabla para la tabla `formula`
--

CREATE TABLE `formula` (
  `codigo` int(11) NOT NULL,
  `producto` varchar(45) NOT NULL,
  `idFormula` int(11) NOT NULL,
  `insumo1` varchar(45) NOT NULL,
  `insumo2` varchar(45) NOT NULL,
  `insumo3` varchar(45) NOT NULL,
  `insumo4` varchar(45) NOT NULL,
  `insumo5` varchar(45) NOT NULL,
  `cantidad1` double NOT NULL,
  `cantidad2` double NOT NULL,
  `cantidad3` double NOT NULL,
  `cantidad4` double NOT NULL,
  `cantidad5` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `formula`
--

INSERT INTO `formula` (`codigo`, `producto`, `idFormula`, `insumo1`, `insumo2`, `insumo3`, `insumo4`, `insumo5`, `cantidad1`, `cantidad2`, `cantidad3`, `cantidad4`, `cantidad5`) VALUES
(0, '', 0, '', '', '', '', '', 0, 0, 0, 0, 0),
(123, 'asd', 123, '12', '2', '2', '2', '2', 2, 2, 2, 2, 2),
(123, '123', 124, '123', '123', '123', '123', '123', 123, 123, 123, 123, 123),
(1, '1', 125, '1', '1', '1', '1', '1', 1, 1, 1, 1, 1),
(1, 'a', 126, '', '', '', '', '', 1, 1, 1, 1, 1),
(5, '5', 127, '5', '5', '5', '5', '5', 5, 5, 5, 5, 5),
(5, '1', 128, '5', '5', '5', '5', '5', 1, 1, 1, 1, 1),
(1, 'a', 129, 'aa', 'a', 'a', 'a', 'a', 4, 4, 4, 0.4, 0.1);

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

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `formula`
--
ALTER TABLE `formula`
  ADD PRIMARY KEY (`idFormula`),
  ADD KEY `idproducto` (`codigo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `formula`
--
ALTER TABLE `formula`
  MODIFY `idFormula` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=130;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
