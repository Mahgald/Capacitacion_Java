package practica2.ej03;

import java.util.Iterator;
import java.util.LinkedList;

public class Club {
	private String nombre;
	private int totalAmarillas;
	private int totalRojas;
	LinkedList<Jugador> jugadores = new LinkedList();
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTotalAmarillas() {
		return totalAmarillas;
	}
	public void setTotalAmarillas(int totalAmarillas) {
		this.totalAmarillas = totalAmarillas;
	}
	public int getTotalRojas() {
		return totalRojas;
	}
	public void setTotalRojas(int totalRojas) {
		this.totalRojas = totalRojas;
	}
	public LinkedList<Jugador> getJugadores() {
		return jugadores;
	}
	public void nuevoJugador(Jugador jugadorNuevo) {
		this.jugadores.add(jugadorNuevo);
	}
	
	public void actualizarTarjetas(){
		for(Jugador jugador: this.jugadores){
			int r=this.getTotalRojas();
			int a=this.getTotalAmarillas();
			r+=jugador.getRojas();
			a+=jugador.getAmarillas();
			this.setTotalAmarillas(a);
			this.setTotalRojas(r);
		}
	}
	public Club(String nombre, int totalAmarillas, int totalRojas) {
		super();
		this.nombre = nombre;
		this.totalAmarillas = totalAmarillas;
		this.totalRojas = totalRojas;
	}
	
	
	
	
}
