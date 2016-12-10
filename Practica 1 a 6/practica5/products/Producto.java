package products;

public class Producto {

	private float precio;
	private int codigo;
	private String nombre;
	
	public Producto(float precio, int codigo, String nombre) {
		super();
		this.precio = precio;
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return " nombre=" + nombre +"precio=" +precio + ", codigo=" + codigo + ", ";
	}
	
	
	
}
