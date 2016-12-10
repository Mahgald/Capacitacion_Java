package practica3.ej01;

import java.util.ArrayList;

public class Universidad {

	private String nombre;
	private String localidad;
	private ArrayList<Carrera> carreras;//composicion
	private ArrayList<Profesor> profesores;//agregacion
	
	public Universidad(String nombre, String localidad) {
		super();
		this.nombre = nombre;
		this.localidad = localidad;
		this.carreras = new ArrayList<>();
		this.profesores = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public ArrayList<Carrera> getCarreras() {
		return carreras;
	}

	public void agregarCarreras(Carrera carrera) {
		this.carreras.add(carrera);
	}

	public ArrayList<Profesor> getProfesores() {
		return profesores;
	}

	public void agregarProfesores(Profesor profesor) {
		this.profesores.add(profesor);
	}
	
	
	
	
	
	
}
