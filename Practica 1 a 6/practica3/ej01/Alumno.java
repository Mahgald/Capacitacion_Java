package practica3.ej01;

import java.util.ArrayList;

public class Alumno {

	private String nombre;
	private int legajo;
	private Carrera carrera;
	private ArrayList<Materia> materias;
	
	public Alumno(String nombre, int legajo/*, Carrera carrera*/) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		this.carrera =null;
		this.materias= new ArrayList<>();
	}
	
	public ArrayList<Materia> getMaterias() {
		return materias;
	}

	public void inscribirMateria(Materia materia) {
		this.materias.add(materia);
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public Carrera getCarrera() {
		return carrera;
	}
	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}
	
	public int materiasIncripto(){
		return (this.materias.size());
	}
	
	
}
