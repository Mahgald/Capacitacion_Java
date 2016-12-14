<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Nuevo Detalle</title>
</head>
<body>
	<h1>Agregar Detalle</h1>
	
	
	<form:form action="../NuevoDetalle" method="post" modelAttribute="detalle">
		
	  	<form:hidden path="id" />
	
		<form:label path="direccion">Direccion: </form:label>
		<form:input path="direccion" />
		<br>

		<form:label path="provincia">Provincia: </form:label>
		<form:input path="provincia" />
		<br>

		<form:label path="pais">Pais: </form:label>
		<form:input path="pais" />
		<br>
		
		<input type="submit" value="Agregar" />
	</form:form>
	
</body>
</html>