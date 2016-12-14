package com.captton.mvcapp.data;

import java.util.List;

import com.captton.mvcapp.model.Empleado;

public interface IEmpleadoDAO {

	
	/*R*/
	public Empleado getEmpleado(Long id);

	public List<Empleado> listEmpleado();
	
	/* CUD */
	public void addEmpleado(Empleado empleado);
	
	public void updateEmpleado(Empleado empleado);
	
	public void removeEmpleado(long id);
	
	
	
}
