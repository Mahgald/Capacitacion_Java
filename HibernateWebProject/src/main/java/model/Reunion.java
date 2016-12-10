package model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import javax.persistence.*;

@Entity
@Table(name="reunion")
public class Reunion {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="fecha")
	
	private Date fecha;
	
	@Column(name="tema")
	private String tema;
	
	@ManyToMany(mappedBy="listaReuniones")
	private List<Empleado> listaEmpleados = new ArrayList<Empleado>();
	
	public Reunion() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public List<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(List<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}
	
	
}
