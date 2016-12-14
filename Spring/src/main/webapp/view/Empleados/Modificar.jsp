<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
	<form:form action="Modificar" method="post" modelAttribute="empleado">
		<form:label path="nombre">Nombre: </form:label>
		<form:input path="nombre" value="empleado.nombre"/>
		<br>

		<form:label path="apellido">Apellido: </form:label>
		<form:input path="apellido" value="empleado.apellido"/>
		<br>

		<form:label path="fecha_nacimiento">Fecha: </form:label>
		<form:input path="fecha_nacimiento" value="empleado.fecha_nacimiento"/>
		<br>

		<form:label path="telefono">Telefono: </form:label>
		<form:input path="telefono" value="telefono"/>
		<br>

		<form:select path="departamento.id">
			<form:option value="0">Seleccione Departamento</form:option>
			<c:forEach items="${listaDptos}" var="dpto">
				<form:option value="${dpto.id}">
					<c:out value="${dpto.nombre}"></c:out>
				</form:option>
			</c:forEach>
		</form:select>

		<input type="submit" value="Guardar" />
	</form:form>
</body>
</html>