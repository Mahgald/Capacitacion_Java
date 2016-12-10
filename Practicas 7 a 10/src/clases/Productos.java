package clases;

public class Productos {

	private long id;
	private String nombre;
	private String tamaño;
	private float precio;
	
	public Productos(long id, String nombre, String tamaño, float precio) {
		this.id = id;
		this.nombre = nombre;
		this.tamaño = tamaño;
		this.precio = precio;
	}
	
	public Productos(String nombre, String tamaño, float precio) {
		
		this.nombre = nombre;
		this.tamaño = tamaño;
		this.precio = precio;
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
	public String getTamaño() {
		return tamaño;
	}
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
}
