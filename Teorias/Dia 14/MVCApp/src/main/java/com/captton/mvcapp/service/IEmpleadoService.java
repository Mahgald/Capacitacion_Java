package com.captton.mvcapp.service;

import java.util.List;

import com.captton.mvcapp.model.Empleado;

public interface IEmpleadoService {
	/*R*/
	public Empleado getEmpleado(long id);

	public List<Empleado> listEmpleado();
	
	/* CUD */
	public void addEmpleado(Empleado empleado);
	
	public void updateEmpleado(Empleado empleado);
	
	public void removeEmpleado(long id);
}
