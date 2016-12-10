package practica2.ej05;

public class Persona {

/*	Declarar una clase que posea tres atributos de tipo 'private'. Declarar los m�todos necesarios para definir su valor y leerlos luego. 
	Hacer un programa que pida al usuario el valor de los atributos definidas, las guarde en la instancia
	y luego las muestre por pantalla en un mensaje de una sola linea*/
	
	
	private String nombre;
	private String apellido;
	private int edad;
	
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
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	public Persona(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	
	
	
}
