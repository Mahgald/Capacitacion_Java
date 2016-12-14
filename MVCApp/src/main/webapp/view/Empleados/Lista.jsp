<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- Import de JSTL para utilizar los tags de Java  -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title></title>

<!-- Bootstrap core CSS -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" />

<style type="text/css">
body {
	margin-top: 70px;
}
</style>
<body>
	<div class="container">
		<div class="page-header">
			<h1>Lista de Empleados</h1>
		</div>
		<div>
			<a class="btn btn-default" href="Nuevo" role="button">Nuevo	Empleado</a>
		</div>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Nombre</th>
					<th>Apellido</th>
					<th>Fecha Nacimiento</th>
					<th>Telefono</th>
					<th>Departamento</th>
					<th>Detalles</th>
					<tr>
			
			</thead>
			<tbody>
				<c:if test="${!empty listaEmpleados}">
					<c:forEach items="${listaEmpleados}" var="empleado">
						<tr>
							<td><c:out value="${empleado.nombre}"></c:out></td>
							<td><c:out value="${empleado.apellido}"></c:out></td>
							<td><c:out value="${empleado.fecha_nacimiento}"></c:out></td>
							<td><c:out value="${empleado.telefono}"></c:out></td>
							<td><c:out value="${empleado.departamento.nombre}"></c:out></td>
							<td><a href="Detalles/${empleado.id}">Detalles</a></td>
						</tr>
					</c:forEach>
				</c:if>
				<c:if test="${empty listaEmpleados}">
					<tr>
						<td colspan="5">No hay datos disponibles por el momento</td>
					</tr>
				</c:if>
			</tbody>
		</table>
	
</div>
</body>
</html>