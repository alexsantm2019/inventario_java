# inventario_java
Inventario realizado en en Spring Boot con Eclipse

# Nombre de la base de datos: inventario_java
 
# Tablas:

CLIENTE:
id
nombre
apellido

ORDEN:
id
fecha
codigo
clienteId

ARTICULO:
id
nombre
codigo
precioUnitario
ordenId


# Script:
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for articulo
-- ----------------------------
DROP TABLE IF EXISTS `articulo`;
CREATE TABLE `articulo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `codigo` varchar(10) DEFAULT NULL,
  `precioUnitario` decimal(10,2) DEFAULT NULL,
  `ordenId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for cliente
-- ----------------------------
DROP TABLE IF EXISTS `cliente`;
CREATE TABLE `cliente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `apellido` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for orden
-- ----------------------------
DROP TABLE IF EXISTS `orden`;
CREATE TABLE `orden` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` varchar(20) DEFAULT NULL,
  `codigo` varchar(10) DEFAULT NULL,
  `clienteId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
