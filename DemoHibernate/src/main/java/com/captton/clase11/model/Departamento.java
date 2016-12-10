package com.captton.clase11.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Departamento")
public class Departamento
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@OneToMany(mappedBy="dpto")
	private List<Empleado> listaEmpleado = new ArrayList<Empleado>();
	
	public Departamento(){}

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public List<Empleado> getListaEmpleado()
	{
		return listaEmpleado;
	}

	public void setListaEmpleado(List<Empleado> listaEmpleado)
	{
		this.listaEmpleado = listaEmpleado;
	}

}
