DROP DATABASE IF EXISTS restaurante_simple;
CREATE DATABASE restaurante_simple;
USE restaurante_simple;

-- Tabla de clientes
CREATE TABLE cliente (
    id_cliente INT AUTO INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    edad INT CHECK (edad >= 0)
);

-- Tabla de meseros
CREATE TABLE mesero (
    id_mesero INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    turno VARCHAR(15)
);

-- Tabla de platos
CREATE TABLE plato (
    id_plato INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    precio DECIMAL(10,2) NOT NULL,
    tipo VARCHAR(30),
    tiempo_preparacion INT
);

/* -- Tabla de pedidos (une cliente, mesero y plato)
CREATE TABLE pedido (
    id_pedido INT AUTO_INCREMENT PRIMARY KEY,
    fecha DATETIME NOT NULL,
    total DECIMAL(10,2),
    id_cliente INT,
    id_mesero INT,
    id_plato INT,
    FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente),
    FOREIGN KEY (id_mesero) REFERENCES mesero(id_mesero),
    FOREIGN KEY (id_plato) REFERENCES plato(id_plato)
);
🍛 2. INSERCIONES (3 por tabla + 1 anidada)
sql
Copiar
Editar
INSERT INTO cliente (nombre, edad) VALUES
('Carlos Torres', 34),
('Marta Gil', 29),
('Esteban Ruiz', 42);

INSERT INTO mesero (nombre, turno) VALUES
('Laura Díaz', 'Mañana'),
('Pedro León', 'Tarde'),
('Sofía Méndez', 'Noche');

INSERT INTO plato (nombre, precio, tipo, tiempo_preparacion) VALUES
('Hamburguesa Clásica', 25000, 'Comida Rápida', 15),
('Ensalada César', 18000, 'Saludable', 10),
('Pizza Margarita', 32000, 'Italiana', 20);

INSERT INTO pedido (fecha, total, id_cliente, id_mesero, id_plato) VALUES
(NOW(), 25000, 1, 1, 1),
(NOW(), 18000, 2, 2, 2),
(NOW(), 32000, 3, 3, 3);

-- Insert con función anidada
INSERT INTO pedido (fecha, total, id_cliente, id_mesero, id_plato) VALUES (
    NOW(),
    18000,
    (SELECT id_cliente FROM cliente WHERE nombre = 'Carlos Torres'),
    (SELECT id_mesero FROM mesero WHERE nombre = 'Pedro León'),
    (SELECT id_plato FROM plato WHERE nombre = 'Ensalada César')
);
🛠️ 3. UPDATES (2 simples + 1 anidado)
sql
Copiar
Editar
-- Simples
UPDATE plato SET precio = 19000 WHERE id_plato = 2;
UPDATE mesero SET turno = 'Mañana' WHERE id_mesero = 3;

-- Anidado
UPDATE pedido
SET total = total * 1.10
WHERE id_plato = (SELECT id_plato FROM plato WHERE nombre = 'Pizza Margarita');
🔍 4. SELECTS (2 simples + 3 adicionales + 1 anidado)
sql
Copiar
Editar
-- Simples
SELECT nombre, precio FROM plato WHERE tiempo_preparacion > 15;
SELECT nombre FROM mesero WHERE turno = 'Noche';

-- Cortos nuevos
SELECT nombre FROM cliente WHERE edad > 30;
SELECT COUNT(*) AS total_platos FROM plato;
SELECT DISTINCT tipo FROM plato;

-- Anidado con JOIN
SELECT c.nombre, p.fecha
FROM pedido p
JOIN cliente c ON p.id_cliente = c.id_cliente
WHERE p.id_mesero = (
    SELECT id_mesero FROM mesero WHERE nombre = 'Laura Díaz'
);
🗑️ 5. DELETES (2 ejemplos)
sql
Copiar
Editar
DELETE FROM pedido WHERE total < 20000;
DELETE FROM plato WHERE tiempo_preparacion > 15;
🔧 6. ALTER (2 ejemplos útiles)
sql
Copiar
Editar
ALTER TABLE cliente ADD COLUMN telefono VARCHAR(15);
ALTER TABLE mesero MODIFY COLUMN turno VARCHAR(20);
🧹 7. TRUNCATE (limpiar sin borrar estructura)
sql
Copiar
Editar
TRUNCATE TABLE pedido;
TRUNCATE TABLE plato;
💣 8. DROP (eliminar tablas y base de datos)
sql
Copiar
Editar
DROP TABLE IF EXISTS pedido;
DROP DATABASE IF EXISTS restaurante_simple; */
