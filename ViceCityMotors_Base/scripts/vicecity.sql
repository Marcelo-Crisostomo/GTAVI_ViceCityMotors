-- =====================================================================
--  VICE CITY MOTORS  ·  Leonida  ·  DSY1102 EP3
--  Script de base de datos para MySQL / MariaDB (XAMPP o Laragon)
--  Ejecuta TODO este archivo en phpMyAdmin / HeidiSQL. No lo modifiques.
-- =====================================================================

-- 1) Crea la base de datos si todavía no existe.
CREATE DATABASE IF NOT EXISTS vicecity CHARACTER SET utf8mb4;

-- 2) Selecciona esa base de datos para ejecutar las sentencias siguientes.
USE vicecity;

-- 3) Crea la tabla que utilizará el DAO de Java.
CREATE TABLE IF NOT EXISTS vehiculos (
    id INT AUTO_INCREMENT PRIMARY KEY,             -- Identificador automático.
    codigo VARCHAR(20) NOT NULL UNIQUE,            -- No permite códigos repetidos (ej: VC-001).
    nombre VARCHAR(100) NOT NULL,                  -- Nombre del vehículo.
    precio_base INT NOT NULL,                      -- Precio ingresado en el formulario.
    tipo ENUM('TERRESTRE', 'ACUATICO') NOT NULL,   -- Solo admite dos tipos.
    CHECK (precio_base > 0)                        -- Rechaza precios no positivos.
);

-- 4) Consulta la tabla (estará vacía al crearla por primera vez).
SELECT * FROM vehiculos;
