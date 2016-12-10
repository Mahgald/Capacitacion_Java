package products;

import provider.MateriaPrima;

public class Electronico extends Producto {
	
	private MateriaPrima materiaprima;
	
	public MateriaPrima getMateriaprima() {
		return materiaprima;
	}

	public void setMateriaprima(MateriaPrima materiaprima) {
		this.materiaprima = materiaprima;
	}

	public Electronico(float precio, int codigo, String nombre, MateriaPrima materiaprima) {
		super(precio, codigo, nombre);
		this.materiaprima = materiaprima;
	}

	@Override
	public String toString() {
		
		return (super.toString()+" materiaprima=" + materiaprima );
	}
	
	
	
	
}
