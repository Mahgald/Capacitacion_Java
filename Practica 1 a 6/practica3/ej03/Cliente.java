package practica3.ej03;

import java.util.ArrayList;

public class Cliente {

	private String nombre;
	private String apellido;
	private String dni;
	private ArrayList<CuentaBancaria> cuentas;
	private ArrayList<TarjetaDebito> tarjetas;
	
	public Cliente(String nombre, String apellido, String dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.cuentas = new ArrayList<>();
		this.tarjetas = new ArrayList<>();
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public ArrayList<CuentaBancaria> getCuentas() {
		return cuentas;
	}

	public void nuevaCuenta(CuentaBancaria cuenta) {
		this.cuentas.add(cuenta);
	}

	public ArrayList<TarjetaDebito> getTarjetas() {
		return tarjetas;
	}

	public void nuevaTarjeta(TarjetaDebito tarjeta) {
		this.tarjetas.add(tarjeta);
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + "]";
	}
	
	
	
}
