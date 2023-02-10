-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-02-2023 a las 17:52:24
-- Versión del servidor: 10.4.25-MariaDB
-- Versión de PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `pruebasofka`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `nave`
--

CREATE TABLE `nave` (
  `id` int(11) NOT NULL,
  `codigo` varchar(200) NOT NULL,
  `tiponave` varchar(200) NOT NULL,
  `nombre` varchar(200) NOT NULL,
  `combustible` varchar(200) NOT NULL,
  `empuje` varchar(200) NOT NULL,
  `peso` varchar(200) NOT NULL,
  `pesocarga` varchar(200) NOT NULL,
  `retirado` varchar(200) NOT NULL,
  `potencia` varchar(200) NOT NULL,
  `numpasajeros` varchar(200) NOT NULL,
  `pais` varchar(200) NOT NULL,
  `usuario` varchar(200) NOT NULL,
  `estado` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tiponave`
--

CREATE TABLE `tiponave` (
  `id` int(11) NOT NULL,
  `codigo` varchar(200) NOT NULL,
  `tiponave` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tiponave`
--

INSERT INTO `tiponave` (`id`, `codigo`, `tiponave`) VALUES
(1, '01', 'nave tripulada');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `nave`
--
ALTER TABLE `nave`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `tiponave`
--
ALTER TABLE `tiponave`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `nave`
--
ALTER TABLE `nave`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tiponave`
--
ALTER TABLE `tiponave`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
