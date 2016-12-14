DROP DATABASE db_ejemplo;
CREATE DATABASE db_ejemplo;
USE db_ejemplo;

create TABLE Departamento (
	id bigint(10) NOT NULL auto_increment,
	nombre varchar(50),
	primary key(id)
);

CREATE TABLE Empleado (
  id bigint(10) NOT NULL AUTO_INCREMENT,
  nombre varchar(50) DEFAULT NULL,
  apellido varchar(50) DEFAULT NULL,
  fecha_nacimiento date NOT NULL,
  telefono varchar(15) NOT NULL,
  idDepartamento bigint(10) NOT NULL,
  PRIMARY KEY (id),
	foreign key (idDepartamento) References Departamento (id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=DEFAULT;

CREATE TABLE EmpleadoDetalles(
	id bigint(10) NOT NULL,
	direccion varchar(100) NOT NULL,
	provincia varchar(100) NULL,
	pais varchar(100) NULL,
	primary key(id),
	foreign key (id) references Empleado (id)
);

CREATE TABLE Reunion(
	id bigint(10) NOT NULL auto_increment,
	fecha datetime NOT NULL,
	tema varchar(250) NULL,
	primary key (id)
);

create table ReunionEmpleado(
	idReunion bigint(10) NOT NULL,
	idEmpleado bigint(10) NOT NULL,
	primary key (idReunion, idEmpleado),
	foreign key (idReunion) references Reunion(id),
	foreign key (idEmpleado) references Empleado(id)
);