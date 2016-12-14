USE db_ejemplo;

INSERT INTO Departamento (nombre) 
VALUES ('IT'),('Ventas'),('RRHH'),('Juerga'),('Zona X');

INSERT INTO Empleado (nombre, apellido, fecha_nacimiento, telefono, idDepartamento)
values ('Federico','Gonzales','1989-01-08','41235789',1),
('Marcela','Lopez','1970-11-08','41235789',3),
('Juan','Perez','1985-02-08','4225845',2),
('Martin','Gomez','1990-07-18','1324234',1),
('Fede','Diaz','1945-09-22','23462345',1),
('Luquitas','El Bichi','1935-01-06','234563245',3),
('Tu vieja','En Tanga','1985-07-15','23467456',3),
('The','Hive','1900-04-10','6531685',2),
('Julian','Perez','1995-05-18','41235789',2);

INSERT INTO EmpleadoDetalles (id,direccion,provincia,pais)
VALUES (1,'Calle Falsa 123','Kualalumpur','Somewhere'),
(2,'Calle Real 321','Catamarca','Argentina'),
(3,'Calle Random','Madrid','España'),
(4,'Calle Pi 3.14','El Calculo','Matematica'),
(5,'Calle K 678','Santa Cruz','Argentina'),
(6,'Calle Viva la Pepa','Viena','Austria'),
(7,'Calle Vivan los Excesos','Amsterdam','Paises Bajos'),
(8,'Calle Falsa 123','Londres','Tierra'),
(9,'Calle Falsa 123','Marte','Via Lactea');

INSERT INTO Reunion (fecha, tema) VALUES ('2015-11-01','Se rompio el monitor de la sala de reuniones'),
										 ('2016-12-24','A Fumar Fasito'),
                                         ('2016-12-31','Despedida de Año');

INSERT INTO ReunionEmpleado VALUES (1,1),(1,2),(1,3),(1,5),(1,7),(2,1),(2,4),(2,6),(2,9),(3,1),(3,2),(3,3),(3,4),(3,5),(3,6),(3,7),(3,8),(3,9);
