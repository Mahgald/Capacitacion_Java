<%@page import="data.DepartamentoDAO"%>
<%@page import="model.Departamento"%>
<%@page import="model.DetallesEmpleado"%>
<%@page import="data.DetallesEmpleadoDAO"%>
<%@page import="model.Empleado"%>
<%@page import="data.EmpleadoDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%
		long id = Long.parseLong(request.getParameter("idEmpleado"));
	
		Empleado emple = EmpleadoDAO.obtenerUnEmpleado(id);
		
		EmpleadoDAO.bajaEmpleado(emple);
		
		response.sendRedirect("index.jsp");
	%>




</body>
</html>