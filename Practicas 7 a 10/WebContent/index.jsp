<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="clases.Productos"%>
<%@page import="java.util.ArrayList"%>
<%@page import="clases.Database"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	ArrayList<Productos> list= Database.obtenerProductos();
%>    
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="es">
<head>
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
	<meta charset="UTF-8">
	<link rel="stylesheet" href="css/bootstrap.css">
	<link rel="stylesheet" href="css/estilos.css">
	<title>Ejercicio 1 </title>
</head>
<body>
	<section class="container">

		<h1></h1>

	<div class="col-md-6 col-md-offset-3">
	<table class="table">
		<tr class="table table-striped">
			<th>ID</th>
			<th>NOMBRE</th>
			<th>TAMAÑO</th>
			<th>PRECIO</th>
		</tr>
		
		<%for(Productos prod: list){ %>
		<tr>
			<td><%=prod.getId() %></td>
			<td><%=prod.getNombre() %></td>
			<td><%=prod.getTamaño() %></td>
			<td><%=prod.getPrecio() %></td>
		</tr>

	<% } %>



	</table>
	</div>
	</section>

	


</body>
</html>