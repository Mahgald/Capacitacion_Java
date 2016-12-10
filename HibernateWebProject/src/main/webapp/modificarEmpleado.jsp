<%@page import="data.EmpleadoDAO"%>
<%@page import="model.Empleado"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport"
	content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
<meta charset="UTF-8">
<link rel="stylesheet" href="css/flatly.css">
<link rel="stylesheet" href="css/styles.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Modificar Empleado</title>
</head>
<body>

	<%
		long id = Long.parseLong(request.getParameter("idEmpleado"));
	
		Empleado emple = EmpleadoDAO.obtenerUnEmpleado(id);
	%>
	
	
	
	

	

	<div class="col-md-8 col-md-offset-2">
		<h1>Modificar Empleado</h1><br>
	<form class="form-horizontal" method="get" action="guardarModificacionEmpleado.jsp?<%=id%>">
		
		<div class="form-group">
			<label class="control-label col-sm-2" for="identificador">ID Empleado:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="identificador" name="identificador"
					value="<%=emple.getId()%>" readonly="readonly">
			</div>
		</div>
	
		<div class="form-group">
			<label class="control-label col-sm-2" for="nombre">Nombre:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="nombre" name="nombre"
					value="<%=emple.getNombre() %>">
			</div>
		</div>

		<div class="form-group">
			<label class="control-label col-sm-2" for="apellido">Apellido:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="apellido"
					name="apellido" value="<%=emple.getApellido()%>">
			</div>
		</div>

		<div class="form-group">
			<label class="control-label col-sm-2" for="fdn">Fecha de
				Nacimiento:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="fdn" name="fdn"
					value="<%=emple.getFechaNacimiento()%>">
			</div>
		</div>

		<div class="form-group">
			<label class="control-label col-sm-2" for="telefono">Telefono:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="telefono"
					name="telefono" value="<%=emple.getTelefono()%>">
			</div>
		</div>

		<div class="form-group">
			<label class="control-label col-sm-2" for="direccion">Direccion:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="direccion"
					name="direccion" value="<%=emple.getDetalle().getDireccion()%>">
			</div>
		</div>

		<div class="form-group">
			<label class="control-label col-sm-2" for="provincia">Provincia:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="provincia"
					name="provincia" value="<%=emple.getDetalle().getProvincia()%>">
			</div>
		</div>

		<div class="form-group">
			<label class="control-label col-sm-2" for="pais">Pais:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="pais" name="pais"
					value="<%=emple.getDetalle().getPais()%>">
			</div>
		</div>

		<div class="form-group">
			<label class="control-label col-sm-2" for="idDpto">ID Dpto:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="idDpto" name="idDpto"
					value="<%= emple.getDepartamento().getId()%>">
			</div>
		</div>
		
		<div class="form-group">
			<label class="control-label col-sm-2" for="departamento">ID Dpto:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="departamento" name="departamento"
					value="<%= emple.getDepartamento().getNombre()%>" readonly="readonly">
			</div>
		</div>
	
		<button type="submit" class="btn btn-danger btbmenupos">Modificar</button>
		<a href="index.jsp" class="btn btn-md btn-default">Volver</a>
	</form><br><br>
	</div>
	
	<script src="https://code.jquery.com/jquery-latest.js"></script>
	
	<script src="js/bootstrap.min.js"></script>
</body>
</html>