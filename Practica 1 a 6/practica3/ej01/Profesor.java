package practica3.ej01;

import java.util.ArrayList;

public class Profesor {

	private String nombre;
	private String titulo;
	private float salario;
	private ArrayList<Materia> materias;
	
	public Profesor(String nombre, String titulo, float salario) {
		super();
		this.nombre = nombre;
		this.titulo = titulo;
		this.materias= new ArrayList<>();
		this.salario = salario;
	}

	public ArrayList<Materia> getMaterias() {
		return materias;
	}

	public void agregarMateria(Materia materia) {
		this.materias.add(materia);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public void actualizarSalario(){
		for (Materia materia : materias) {
			this.salario+=materia.getRemuneracion();
		}
	}
	
	
	
	
}
