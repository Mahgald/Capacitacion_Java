<%@page import="java.util.Collections"%>
<%@page import="data.ReunionDAO"%>
<%@page import="model.Reunion"%>
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
		long id = Long.parseLong(request.getParameter("idReunion"));
	
	
		Reunion meeting = ReunionDAO.obtenerUnReunion(id);
		
	%>



	<section class="container">

	<h1>LISTADO DE EMPLEADOS</h1>
	<h3>Tema de la reunion - <%=meeting.getTema()%> - Cantidad de empleados - <%=meeting.getListaEmpleados().size()%></h3>
	<br>

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
				for (Empleado empl : meeting.getListaEmpleados()) {
			%>
			<tr>
				<td><%=empl.getId()%></td>
				<td><%=empl.getNombre()%></td>
				<td><%=empl.getApellido()%></td>
				<td><%=empl.getFechaNacimiento()%>
				<td><%=empl.getTelefono()%></td>
				<td><%=empl.getDetalle().getDireccion()%></td>
				<td><%=empl.getDetalle().getProvincia()%></td>
				<td><%=empl.getDetalle().getPais()%></td>
				<td><%=empl.getDepartamento().getNombre()%></td>

			</tr>
			<%
				}
			%>
		
		</table>
	</div>


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
		
						<%
		List<Empleado> todos = EmpleadoDAO.listarEmpleado();
		List<Empleado> lista = new ArrayList<Empleado>();				
		for(Empleado empleado : todos){
			for(Empleado em : meeting.getListaEmpleados()){
				if(!empleado.equals(em) && !lista.contains(empleado)){
					lista.add(empleado);
				}
			}
			
		}
		

	%>



	

	<div class="">
		<table class="table table-bordered">
			<tr class="tablehead danger">
				<th>ID</th>
				<th>NOMBRE</th>
				<th>APELLIDO</th>
				<th>DEPARTAMENTO</th>
				
			</tr>

			<% for(Empleado empleado : lista){ %>
			
			<tr>
				<td><%=empleado.getId()%></td>
				<td><%=empleado.getNombre()%></td>
				<td><%=empleado.getApellido()%></td>
				<td><%=empleado.getDepartamento().getNombre()%></td>
			

			</tr>
			<%
				}
			%>
		</table>
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
						<form class="form-horizontal" method="get"action="modificarEmpleado.jsp">
							<div class="form-group">
								<label class="control-label col-sm-2" for="idEmpleado">IdEmpleado:</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="dpto"
										name="idEmpleado"
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
									<input type="text" class="form-control" id="dpto"
										name="idEmpleado"
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

	<script src="js/jquery.js"></script>

	<script src="js/bootstrap.min.js"></script>
</body>
</html>