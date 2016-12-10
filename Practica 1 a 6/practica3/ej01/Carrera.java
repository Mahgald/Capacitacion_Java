package practica3.ej01;

import java.util.ArrayList;

public class Carrera {
	
	private String nombre;
	
	private ArrayList<Materia> materias;
	private ArrayList<Alumno> alumnos;
	
	public Carrera(String nombre, int cantMaterias) {
		super();
		this.nombre = nombre;
		
		this.alumnos = new ArrayList<>();
		this.materias = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Materia> getMaterias() {
		return materias;
	}

	public void agregarMateria(Materia materia) {
		this.materias.add(materia);
	}

	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}

	public void agregarAlumno(Alumno alumno) {
		this.alumnos.add(alumno);
		alumno.setCarrera(this);
	}
	
	public int cantInscriptos(){
		return (alumnos.size());
	}
	
	public int cantMaterias(){
		return (materias.size());
	}
	
	
}
