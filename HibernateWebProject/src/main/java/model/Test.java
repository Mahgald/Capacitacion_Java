package model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import data.DetallesEmpleadoDAO;
import data.EmpleadoDAO;

public class Test {

	public static void main(String[] args) throws ParseException {
		List<Empleado> lista = EmpleadoDAO.listarEmpleado();
		
		for (Empleado empleado : lista) {
			System.out.println(empleado.toString());
			
		}
	}

}
