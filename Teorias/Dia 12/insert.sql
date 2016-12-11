INSERT INTO Departamento (nombre) 
VALUES ('IT'),('Ventas'),('RRHH');

INSERT INTO Empleado (nombre, apellido, fecha_nacimiento, telefono, idDepartamento)
values ('Federico','Gonzales','1989-01-08','41235789',1),
('Marcela','Lopez','1970-11-08','41235789',3),
('Julian','Perez','1995-05-18','41235789',2);

INSERT INTO `db_ejemplo`.`DetallesEmpleado` (`id`,`direccion`,`provincia`,`pais`)
VALUES (1,'Calle Falsa 123','Kualalumpur','Somewhere'),
(2,'Calle Falsa 123','Londres','Tierra'),
(3,'Calle Falsa 123','Marte','Via Lactea');

INSERT INTO Reunion (fecha, tema) VALUES ('2015-11-01','Se rompio el monitor de la sala de reuniones');

INSERT INTO ReunionEmpleado VALUES (1,1),(1,2),(1,3);
