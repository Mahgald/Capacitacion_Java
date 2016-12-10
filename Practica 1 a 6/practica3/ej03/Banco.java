package practica3.ej03;

import java.util.ArrayList;

public class Banco {

	private String nombre;
	private String direccion;
	private String localidad;
	private ArrayList<CuentaBancaria> cuentas;
	private ArrayList<Cliente> clientes;
	
	public Banco(String nombre, String direccion, String localidad) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.localidad = localidad;
		this.cuentas = new ArrayList<>();
		this.clientes = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public ArrayList<CuentaBancaria> getCuentas() {
		return cuentas;
	}

	public void nuevaCuenta(CuentaBancaria cuenta) {
		this.cuentas.add(cuenta);
		
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void nuevoCliente(Cliente cliente) {
		CuentaBancaria aux= new CuentaBancaria();
		TarjetaDebito td= new TarjetaDebito(500f, 3, "Visa");
		
		cliente.nuevaTarjeta(td);
		this.clientes.add(cliente);
		
		cliente.nuevaCuenta(aux);
		this.nuevaCuenta(aux);
		
		aux.nuevaTarjetaAsociada(td);
		
	}
	
	
	
	
	
	
	
	
}
