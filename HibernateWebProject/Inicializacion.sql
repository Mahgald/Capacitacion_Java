INSERT INTO Departamento (nombre) 
VALUES ('IT'),('Ventas'),('RRHH');

INSERT INTO Empleado (nombre, apellido, fecha_nacimiento, telefono, idDepartamento)
values ('Federico','Gonzales','1989-01-08','41235789',1),
('Marcela','Lopez','1970-11-08','41235789',3),
('Marcela','Tauro','1950-1-08','23123123',2),
('Juena','Rodriguez','1923-6-11','65856868',2),
('Carlos','Dominguez','1910-4-22','23452345',1),
('Julian','Perez','1995-05-18','41235789',2);

INSERT INTO `db_ejemplo`.`DetallesEmpleado` (`id`,`direccion`,`provincia`,`pais`)
VALUES (1,'Calle Falsa 123','Kualalumpur','Somewhere'),
(2,'Calle Falsa 123','Madrid','España'),
(3,'Calle Falsa 123','Barcelona','España'),
(4,'Calle Falsa 123','Buenos Aires','Argentina'),
(5,'Calle Falsa 123','Londres','Reino unido'),
(6,'Calle Falsa 123','Marte','Via Lactea');

INSERT INTO Reunion (fecha, tema) VALUES ('2015-11-01','Se rompio el monitor de la sala de reuniones');

INSERT INTO ReunionEmpleado VALUES (1,1),(1,2),(1,3),(1,4),(1,5),(1,6);