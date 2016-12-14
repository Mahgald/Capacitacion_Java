package model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.Proxy;

@Entity
@Proxy(lazy=false)
public class Empleado {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String nombre;
	
	private String apellido;
	
	private String telefono;
	
	private Date fecha_nacimiento;
	
	
	@OneToOne(mappedBy="emple",orphanRemoval=true)
	private EmpleadoDetalles detalle;
	
	@ManyToOne(cascade={CascadeType.MERGE, CascadeType.PERSIST})
	@JoinColumn(name="idDepartamento")
	private Departamento departamento;
	
	@ManyToMany(cascade={CascadeType.MERGE, CascadeType.PERSIST},fetch=FetchType.EAGER)
	@JoinTable(name="ReunionEmpleado",
			joinColumns={@JoinColumn(name="idEmpleado")},
			inverseJoinColumns={@JoinColumn(name="idReunion")})
	private List<Reunion> listaReuniones = new ArrayList<Reunion>();

	
	public List<Reunion> getListaReuniones() {
		return listaReuniones;
	}


	public void setListaReuniones(List<Reunion> listaReuniones) {
		this.listaReuniones = listaReuniones;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}


	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}


	public Departamento getDepartamento() {
		return departamento;
	}


	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	public EmpleadoDetalles getDetalle() {
		return detalle;
	}


	public void setDetalle(EmpleadoDetalles detalle) {
		this.detalle = detalle;
	}
	
}
