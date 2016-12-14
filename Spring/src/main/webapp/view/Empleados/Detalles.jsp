<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" />
<title>Empleado Detalle</title>
</head>
<body>

	<div class="container">
		<h1>EMPLEADO DETALLES</h1>
		<br>
		<c:if test="${empleado!=null}">
			<table class="table table-striped table-bordered">
				<tr class="table danger">
					<th>NOMBRE</th>
					<th>APELLIDO</th>
					<th>FECHA NACIMIENTO</th>
					<th>DIRECCION</th>
					<th>PROVINCIA</th>
					<th>PAIS</th>
					<th>DEPARTAMENTO</th>
				</tr>

				<tr>
					<td><c:out value="${empleado.nombre}"></c:out></td>
					<td><c:out value="${empleado.apellido}"></c:out></td>
					<td><c:out value="${empleado.fecha_nacimiento}"></c:out></td>
					<td><c:out value="${empleado.detalle.direccion}"></c:out></td>
					<td><c:out value="${empleado.detalle.provincia}"></c:out></td>
					<td><c:out value="${empleado.detalle.pais}"></c:out></td>
					<td><c:out value="${empleado.departamento.nombre}"></c:out></td>
				</tr>
			</table>
		</c:if>
		<a href="<%=request.getContextPath()%>/Empleados/" class="btn btn-danger">Volver</a>
		<c:if test="${empleado.detalle==null}">
			<a href="<%=request.getContextPath()%>/Empleados/NuevoDetalle/${empleado.id}" class="btn btn-danger">Agregar Detalle</a>
		</c:if>
	</div>
</body>
</html>