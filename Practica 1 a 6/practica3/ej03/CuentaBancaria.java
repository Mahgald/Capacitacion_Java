package practica3.ej03;

import java.util.ArrayList;
import java.util.Random;

public class CuentaBancaria {

	private int nro;
	private ArrayList<TarjetaDebito> tarjetasAsociadas;
	private Random r= new Random();
	
	public CuentaBancaria() {
		super();
		this.nro = r.nextInt(0123456);
		this.tarjetasAsociadas = new ArrayList<>();
	}

	public int getNro() {
		return nro;
	}

	public ArrayList<TarjetaDebito> getTarjetasAsociadas() {
		return tarjetasAsociadas;
	}

	public void nuevaTarjetaAsociada(TarjetaDebito tarjetaAsociada) {
		this.tarjetasAsociadas.add(tarjetaAsociada);
	}
	
	
	
}
