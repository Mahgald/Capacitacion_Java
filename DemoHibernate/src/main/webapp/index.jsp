<%@page import="com.captton.clase11.model.Empleado"%>
<%@page import="java.util.List"%>
<%@page import="com.captton.clase11.data.EmpleadoDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	List<Empleado> lista = EmpleadoDAO.listarEmpleado();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border=1>
		<tr>
			<td>Nombre</td>
			<td>Apellido</td>
			<td>Fecha de nacimiento</td>
			<td>Telefono</td>
			<td>Pais</td>
			<td>Departamento</td>
		</tr>
		<%
			for (Empleado emple : lista)
			{
		%>
		<tr>
			<td><%=emple.getNombre()%></td>
			<td><%=emple.getApellido() %></td>
			<td><%=emple.getFecha_nacimiento() %></td>
			<td><%=emple.getTelefono()%></td>
			<td><%=emple.getDetalle().getPais()%></td>
		</tr>

		<%
			}
		%>
	</table>
</body>
</html>