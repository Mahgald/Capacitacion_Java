package enterprise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

import products.Electronico;
import products.Producto;
import products.Servicio;
import program.Cliente;
import provider.MateriaPrima;
import provider.Proveedor;

public class Empresa {

	private String nombre;
	private String direccion;
	//private Factura factura;
	
	private Proveedor proveedor;
	private ArrayList<MateriaPrima> materiales;
	private ArrayList<Producto> productos;
	private ArrayList<Integer> stocks;
	public ArrayList<Integer> getStocks() {
		return stocks;
	}


	public void setStocks(ArrayList<Integer> stocks) {
		this.stocks = stocks;
	}

	private ArrayList<Cliente> clientes;
	
	public Empresa(String nombre, String direccion, Proveedor proveedor) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.proveedor = proveedor;
		this.materiales = new ArrayList<>();
		this.productos = new ArrayList<>();
		this.clientes = new ArrayList<>();
		this.stocks = new ArrayList<>();
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

	public ArrayList<MateriaPrima> getMateriales() {
		return materiales;
	}

	public void comprarMateriales(ArrayList<MateriaPrima> materiales) {
		this.materiales = materiales;
		for (MateriaPrima materiaprima : materiales) {
			this.materiales.add(materiaprima);
		}
	
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public ArrayList<Cliente> getClientes(){
		return this.clientes;
	}
	
	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	
	public void fabricarElectronico(float precio, String nombre,int cantidad){
		
		Random r= new Random();
		if(this.materiales.size()>0){
			Electronico nuevoElectronico = new Electronico(precio, r.nextInt(), nombre, this.materiales.remove(this.materiales.size()-1));
				
			if(this.productos.contains(nuevoElectronico)){
				this.stocks.set(this.productos.indexOf(nuevoElectronico), this.stocks.get(this.productos.indexOf(nuevoElectronico)+cantidad));
			}else{
				this.productos.add(nuevoElectronico);
				this.stocks.add(cantidad);
			}
			
		}else{
			this.hacerPedido(cantidad);
			this.fabricarElectronico(precio, nombre,cantidad);
		}
		
		
	}
	
	public void hacerPedido(int cantidad){
		ArrayList<MateriaPrima> pedido= this.proveedor.recibirPedido(cantidad);
		for (MateriaPrima materiaPrima : pedido) {
			this.materiales.add(materiaPrima);
		}
	}
	
	public Servicio crearServicio(float precio, String nombre){
		Random r= new Random();
		Servicio nuevoServicio= new Servicio(precio, r.nextInt(), nombre);
		return nuevoServicio;
	
	}
	
	
	
	public boolean isCliente(int dni){
		boolean ok=false;
		for (Cliente cliente : clientes) {
			if(cliente.getDni()==dni){
				ok=true;
			}
		}
		if(ok){
			return true;
		}else{
			return false;
		}
	}
	
	public void nuevoCliente(Cliente cli){
		this.clientes.add(cli);
	}
	
	public Cliente buscarCliente(int dni){
		int i=0;
		while ((this.clientes.get(i)).getDni()!=dni) {
			i++;
		}
		return(this.clientes.get(i));
	}
	
	public void initialize(){
		int stockMax=20;
		Servicio helpDesk = new Servicio(200, 1, "helpDesk");
		Servicio actualizaciones = new Servicio(200, 2, "actualizaciones");
		Servicio consultasTelefonicas = new Servicio(200, 3, "consultasTelefonicas");
		this.productos.add(helpDesk);
		this.stocks.add(-1);
		this.productos.add(actualizaciones);
		this.stocks.add(-1);
		this.productos.add(consultasTelefonicas);
		this.stocks.add(-1);
		
		this.fabricarElectronico(6800, "Evga GTX 960",stockMax);
		this.fabricarElectronico(7800, "Evga GTX 970",stockMax);
		this.fabricarElectronico(8800, "Evga GTX 980",stockMax);
		this.fabricarElectronico(15000, "Evga GTX 1080",stockMax);
		this.fabricarElectronico(12000, "Evga GTX 1070",stockMax);
		
	}
	
	public boolean descontarStock(Producto prod, int cantidad){
		int i=0;
		while (this.getProductos().get(i)!= prod){
			i++;
		}if(this.getStocks().get(i)>=cantidad){
			int aux=this.stocks.get(i);
			aux -= cantidad;
			this.stocks.set(i, aux);
			return true;
		}else{
			return false;
		}
		
	}
	
	public boolean isHabilitado(Cliente cli){
		if(this.buscarCliente(cli.getDni()).getDeuda()>=1000){
			return true;
		}else{
			return false;
		}
	}
	
	
	public Factura nuevaFactura(Cliente cli){
		Factura f = new Factura(cli);
		
		f.agregarProducto(this.getProductos().get(2), 1);
		
		f.agregarProducto(this.getProductos().get(4), 1);
		this.descontarStock(this.getProductos().get(4),1);
		f.agregarProducto(this.getProductos().get(6), 5);
		this.descontarStock(this.getProductos().get(6),5);
		f.agregarProducto(this.getProductos().get(7), 9);
		this.descontarStock(this.getProductos().get(7),9);
		return f;
			
	}	
	
	public void nuevaVenta(Cliente cli){
		if(!this.isCliente(cli.getDni())){
			this.nuevoCliente(cli);
			this.nuevaFactura(cli);
		}else{
			if(this.isHabilitado(cli)){
				this.nuevaFactura(cli);
			}
		}
	}
	
		
 	public String imprimirFactura(Factura fac){
		String impresion="";
		impresion+="Cliente: "+fac.getCli().getNombre()+" "+fac.getCli().getApellido()+"\n";
		impresion+="DNI :"+fac.getCli().getDni()+"\n";
		impresion+="\n";		
		for (Producto prod : fac.getCompra()) {
			if(prod.getClass().equals(Electronico.class)){
				impresion+="Electronico Nombre"+((Electronico)prod).getNombre()+"\n";
				impresion+="Electronico Precio "+((Electronico)prod).getPrecio()+"\n";
				
				impresion+="\n";
			}else{
				impresion+="Servicio nombre	" +((Servicio)prod).getNombre()+"\n";
				impresion+="Servicio Precio "+((Servicio)prod).getPrecio()+"\n";
				
				impresion+="\n";
			}
		}
		impresion+="Cantidad de productos comprados "+fac.getCant()+"\n";
		impresion+="Total a pagar de iva "+fac.calcularIva()+"\n";
		impresion+="Total a pagar sin iva "+fac.getTotal()+"\n";
		impresion+="Total a pagar con iva "+(fac.getTotal()+fac.calcularIva())+"\n";
		return impresion;
	}
}	
