package program;

public class Cliente {

	private String nombre;
	private String apellido;
	private int dni;
	private float deuda;
	
	public Cliente(String nombre, String apellido, int dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.deuda = 0;
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
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public float getDeuda(){
		return deuda;
	}
	
}
