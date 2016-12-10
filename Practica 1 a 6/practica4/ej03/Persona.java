package practica4.ej03;

import java.util.Random;

public abstract class Persona {
	
	protected String nombre;
	protected String apellido;
	protected int edad;
	protected int id;
	protected int horasVuelo;
	private Random r;
	
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.id = r.nextInt();
		this.horasVuelo = 0;
	}
	
	protected abstract boolean superaHoras();
	
	
	protected abstract String actualizacionEstado();
		
	public void sumarHorasVuelo(){
		this.horasVuelo++;
	}
	
	public int getHorasVuelo(){
		return horasVuelo;
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getId() {
		return id;
	}
	
	
	
	
	
}
