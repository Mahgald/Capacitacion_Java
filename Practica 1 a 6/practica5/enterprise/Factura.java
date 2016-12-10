package enterprise;

import java.util.ArrayList;
import java.util.Random;

import products.Electronico;
import products.Producto;
import products.Servicio;
import program.Cliente;

public class Factura {
	
	private Random r= new Random();
	
	private Cliente cli;
	private int nroRemito;
	private float total;
	private int cant;
	private ArrayList<Producto> compra;
	
	public Factura(Cliente cli) {
		super();
		this.cli = cli;
		this.nroRemito = r.nextInt();
		this.total = 0;
		this.cant = 0;
		this.compra = new ArrayList<>();
	}

	public void agregarProducto(Producto prod, int cant){
		this.compra.add(prod);
		this.cant+=cant;
		this.total+=prod.getPrecio()*cant;
	}

	public float calcularIva(){
		return total*0.21f;
	}
	
	private void calcularTotal(){
		total+= total*cant;
	}
	
	public float getTotal(){
		return total;
	}
	
	public Cliente getCli() {
		return cli;
	}

	public void setCli(Cliente cli) {
		this.cli = cli;
	}

	public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}

	public ArrayList<Producto> getCompra(){
		return this.compra;
	}
	
		
	
	
	
	
}
