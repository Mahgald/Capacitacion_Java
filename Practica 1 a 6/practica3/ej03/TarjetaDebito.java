package practica3.ej03;

public class TarjetaDebito {
	
	private float saldo;
	private int cantOperaciones;
	private String nombre;
	
	public TarjetaDebito(float saldo, int cantOperaciones, String nombre) {
		super();
		this.saldo = saldo;
		this.cantOperaciones = cantOperaciones;
		this.nombre = nombre;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public int getCantOperaciones() {
		return cantOperaciones;
	}
	public void setCantOperaciones(int cantOperaciones) {
		this.cantOperaciones = cantOperaciones;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
