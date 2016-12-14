package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class EmpleadoDetalles {
	
	@Id
	private long id;
	
	private String direccion;
	
	private String provincia;
	
	private String pais;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Empleado emple;
	
	public EmpleadoDetalles() {
		// TODO Auto-generated constructor stub
	}
	
	public EmpleadoDetalles(long id) {
		this.id = id;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Empleado getEmple() {
		return emple;
	}

	public void setEmple(Empleado emple) {
		this.emple = emple;
	}

	
	
	
	
}
