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
	<form:form action="../Modificar" method="post" modelAttribute="empleado">
		<form:hidden path="id"/>
		<form:label path="nombre">Nombre: </form:label>
		<form:input path="nombre" />
		<br>

		<form:label path="apellido">Apellido: </form:label>
		<form:input path="apellido"/>
		<br>

		<form:label path="telefono">Telefono: </form:label>
		<form:input path="telefono"/>
		<br>
		
		<form:label path="fecha_nacimiento">Fecha de Nacimiento: </form:label>
		<form:input path="fecha_nacimiento"/>
		<br>
	
		<form:label path="detalle.direccion">Direccion: </form:label>
		<form:input path="detalle.direccion"/>
		<br>
		
		<form:label path="detalle.provincia">Provincia: </form:label>
		<form:input path="detalle.provincia"/>
		<br>
		
		<form:label path="detalle.pais">Pais: </form:label>
		<form:input path="detalle.pais"/>
		<br>
		<form:select path="departamento.id">
			<form:option value="${empleado.departamento.id}">Seleccione Departamento</form:option>
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