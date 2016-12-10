<%@page import="data.DetallesEmpleadoDAO"%>
<%@page import="data.DepartamentoDAO"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.DateFormat"%>
<%@page import="data.EmpleadoDAO"%>
<%@page import="model.DetallesEmpleado"%>
<%@page import="model.Empleado"%>
<%@page import="model.Departamento"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alta de Empleado</title>
</head>
<body>
	<%
		
			String nombre = request.getParameter("nombre");
			String apellido = request.getParameter("apellido");

			DateFormat aux = new SimpleDateFormat("yyyy-MM-dd");
			String fecha = request.getParameter("fdn");
			Date fdn = aux.parse(fecha);

			String idDpto = request.getParameter("dpto");
			String telefono = request.getParameter("telefono");
			String direccion = request.getParameter("direccion");
			String provincia = request.getParameter("provincia");
			String pais = request.getParameter("pais");

			Empleado e = new Empleado();
			DetallesEmpleado detemple = new DetallesEmpleado();
			Departamento d = new Departamento();

			d = DepartamentoDAO.obtenerUnDepartamento((Integer) Integer.parseInt(idDpto));

			e.setNombre(nombre);
			e.setApellido(apellido);
			e.setFechaNacimiento(fdn);
			e.setTelefono(telefono);
			e.setDepartamento(d);

			EmpleadoDAO.altaEmpleado(e);
			e = EmpleadoDAO.listarEmpleado().get(EmpleadoDAO.listarEmpleado().size() - 1);

			detemple.setDireccion(direccion);
			detemple.setProvincia(provincia);
			detemple.setPais(pais);
			detemple.setEmple(e);
			detemple.setId(e.getId());
			e.setDetalle(detemple);

			EmpleadoDAO.modificarEmpleado(e);
			DetallesEmpleadoDAO.altaDetalleEmpleado(detemple);
		

		response.sendRedirect("index.jsp");
	%>
</body>
</html>