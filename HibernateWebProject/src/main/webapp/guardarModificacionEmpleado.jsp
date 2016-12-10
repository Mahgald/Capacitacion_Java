<%@page import="data.DetallesEmpleadoDAO"%>
<%@page import="data.EmpleadoDAO"%>
<%@page import="data.DepartamentoDAO"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="model.Departamento"%>
<%@page import="model.DetallesEmpleado"%>
<%@page import="model.Empleado"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.DateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Guardar Modificacion Empleado</title>
</head>
<body>
		<%
		
			String identificador=request.getParameter("identificador");
		
			long idEmpleado = Long.parseLong(identificador);
		
			String nombre = request.getParameter("nombre");
			String apellido = request.getParameter("apellido");

			DateFormat aux = new SimpleDateFormat("yyyy-MM-dd");
			String fecha = request.getParameter("fdn");
			Date fdn = aux.parse(fecha);

			String idDpto = request.getParameter("idDpto");
			String telefono = request.getParameter("telefono");
			String direccion = request.getParameter("direccion");
			String provincia = request.getParameter("provincia");
			String pais = request.getParameter("pais");

			Departamento d = new Departamento();
			Empleado e = EmpleadoDAO.obtenerUnEmpleado(idEmpleado);
			e.setNombre(nombre);
			e.setApellido(apellido);
			e.setFechaNacimiento(fdn);
			e.setTelefono(telefono);
			e.getDetalle().setId(idEmpleado);
			e.getDetalle().setDireccion(direccion);
			e.getDetalle().setProvincia(provincia);
			e.getDetalle().setPais(pais);
			
			
			
			d = DepartamentoDAO.obtenerUnDepartamento((long) Long.parseLong(idDpto));
			e.setDepartamento(d);
			
			EmpleadoDAO.modificarEmpleado(e);
			DetallesEmpleadoDAO.modificarDetalleDeEmpleado(e.getDetalle());
// 			
		

		response.sendRedirect("index.jsp");
	%>
</body>
</html>