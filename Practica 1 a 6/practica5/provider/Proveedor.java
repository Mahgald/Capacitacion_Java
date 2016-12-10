package provider;

import java.util.ArrayList;

public class Proveedor {

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Proveedor(String nombre) {
		super();
		this.nombre = nombre;
	}

	private MateriaPrima crearMateria(){
		MateriaPrima mat= new MateriaPrima("Cuda Core");
		return mat;
	}
	
	public ArrayList<MateriaPrima> recibirPedido(int cantidad){
		ArrayList<MateriaPrima> pedido= new ArrayList<>();
		for (int i = 0; i < cantidad; i++) {
			pedido.add(this.crearMateria());
		}
		return pedido;
	}
	
	
}
