<%@page import="model.Departamento"%>
<%@page import="data.EmpleadoDAO"%>
<%@page import="model.Empleado"%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.lang.reflect.Array"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta name="viewport"
	content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
<meta charset="UTF-8">
<link rel="stylesheet" href="css/simplex.css">
<link rel="stylesheet" href="css/styles.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Index</title>
</head>
<body>
	<%
		List<Empleado> lista = EmpleadoDAO.listarEmpleado();
	%>



	<section class="container">

	<h1>LISTADO</h1>

	<div class="col-md-12">
		<table class="table table-bordered">
			<tr class="table tablehead info">
				<th>ID</th>
				<th>NOMBRE</th>
				<th>APELLIDO</th>
				<th>FECHA NACIMIENTO</th>
				<th>TELEFONO</th>
				<th>DIRECCION</th>
				<th>PROVINCIA</th>
				<th>PAIS</th>
				<th>DEPARTAMENTO</th>


			</tr>

			<%
				for (Empleado empl : EmpleadoDAO.listarEmpleado()) {
			%>
			<tr>
				<td><%=empl.getId()%></td>
				<td><%=empl.getNombre()%></td>
				<td><%=empl.getApellido()%></td>
				<td><%=empl.getFechaNacimiento() %>
				<td><%=empl.getTelefono()%></td>
				<td><%=empl.getDetalle().getDireccion() %></td>
				<td><%=empl.getDetalle().getProvincia() %></td>
				<td><%=empl.getDetalle().getPais() %></td>
				<td><%=empl.getDepartamento().getNombre()%></td>
			</tr>
			<%
				}
			%>
		</table>
	</div>

		<%  %>

	</section>

	<section class="container">
	<div class="btn-group btbmenupos ">

		<button type="button" class="btn btn-default" data-toggle="modal"
			data-target="#agregarEmpleado">Agregar</button>

		<button type="button" class="btn btn-info" data-toggle="modal"
			data-target="#modificarEmpleado">Modificar</button>

		<button type="button" class="btn btn-danger" data-toggle="modal"
			data-target="#eliminarEmpleado">Eliminar</button>

	</div>

	<div class="container">
		<!-- Modal -->
		<div class="modal fade" id="agregarEmpleado" role="dialog">
			<div class="modal-dialog">

				<!-- Modal content-->
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">&times;</button>
						<h4 class="modal-title">AGREGAR EMPLEADO</h4>
					</div>
					<div class="modal-body">
						<form class="form-horizontal" method="get" action="altaEmpleado.jsp">
							<div class="form-group">
								<label class="control-label col-sm-2" for="nombre">Nombre:</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="nombre"
										name="nombre" placeholder="Ingrese Nombre">
								</div>
							</div>

							<div class="form-group">
								<label class="control-label col-sm-2" for="apellido">Apellido:</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="apellido"
										name="apellido" placeholder="Ingrese Apellido">
								</div>
							</div>

							<div class="form-group">
								<label class="control-label col-sm-2" for="fdn">Fecha de
									Nacimiento:</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="fdn" name="fdn"
										placeholder="yyyy-mm-dd">
								</div>
							</div>

							<div class="form-group">
								<label class="control-label col-sm-2" for="telefono">Telefono:</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="telefono"
										name="telefono" placeholder="Ingrese Telefono">
								</div>
							</div>
							
							<div class="form-group">
								<label class="control-label col-sm-2" for="direccion">Direccion:</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="direccion"
										name="direccion" placeholder="Ingrese Direccion">
								</div>
							</div>
							
							<div class="form-group">
								<label class="control-label col-sm-2" for="provincia">Provincia:</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="provincia"
										name="provincia" placeholder="Ingrese Provincia">
								</div>
							</div>
							
							<div class="form-group">
								<label class="control-label col-sm-2" for="pais">Pais:</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="pais"
										name="pais" placeholder="Ingrese Pais">
								</div>
							</div>

							<div class="form-group">
								<label class="control-label col-sm-2" for="dpto">Departamento:</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="dpto" name="dpto"
										placeholder="Ingrese nro de Depatamento">
								</div>
							</div>
					</div>

					<div class="modal-footer">
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<button type="submit" class="btn btn-danger">Agregar</button>
								<button type="button" class="btn btn-default"
									data-dismiss="modal">Cancelar</button>
							</div>
						</div>
					</div>
					</form>
				</div>

			</div>
		</div>

	</div>

	<div class="container">
		<!-- Modal -->
		<div class="modal fade" id="modificarEmpleado" role="dialog">
			<div class="modal-dialog">

				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">&times;</button>
						<h4 class="modal-title">MODIFICAR EMPLEADO</h4>
					</div>
					<div class="modal-body">
						<form class="form-horizontal" method="get" action="modificarEmpleado.jsp">
						<div class="form-group">
								<label class="control-label col-sm-2" for="idEmpleado">IdEmpleado:</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="dpto" name="idEmpleado"
										placeholder="Ingrese nro de ID del Empleado a modificar">
								</div>
							</div>
					</div>
					<div class="modal-footer">
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<button type="submit" class="btn btn-danger">Aceptar</button>
								<button type="button" class="btn btn-default"
									data-dismiss="modal">Cancelar</button>
							</div>
						</div>
					</div>
					</form>
				</div>

			</div>
		</div>

	</div>

	<div class="container">
		<!-- Modal -->
		<div class="modal fade" id="eliminarEmpleado" role="dialog">
			<div class="modal-dialog">

				<!-- Modal content-->
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">&times;</button>
						<h4 class="modal-title">ELIMINAR EMPLEADO</h4>
					</div>
					<div class="modal-body">
						<form class="form-horizontal" method="get" action="bajaEmpleado.jsp">
						<div class="form-group">
								<label class="control-label col-sm-2" for="idEmpleado">IdEmpleado:</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="dpto" name="idEmpleado"
										placeholder="Ingrese nro de ID del Empleado a eliminar">
								</div>
							</div>
					</div>
					<div class="modal-footer">
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<button type="submit" class="btn btn-danger">Aceptar</button>
								<button type="button" class="btn btn-default"
									data-dismiss="modal">Cancelar</button>
							</div>
						</div>
					</div>
					</form>
				</div>

			</div>
		</div>

	</div>



	</section>

	<script src="https://code.jquery.com/jquery-latest.js"></script>

	<script src="js/bootstrap.min.js"></script>
</body>
</html>