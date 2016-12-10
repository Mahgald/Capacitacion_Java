package practica2.ej03;

import java.util.LinkedList;

public class Jugador {
	private float sueldo;
	private int amarillas=0;
	private int rojas=0;
	private int goles=0;
	private String nombre;
	LinkedList<Auto> autos = new LinkedList();
	
	public int getAmarillas() {
		return amarillas;
	}
	public void setAmarillas(int amarillas) {
		this.amarillas = amarillas;
	}
	public int getRojas() {
		return rojas;
	}
	public void setRojas(int rojas) {
		this.rojas = rojas;
	}
	public int getGoles() {
		return goles;
	}
	public void setGoles(int goles) {
		this.goles = goles;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LinkedList<Auto> getAutos() {
		return autos;
	}
	public void setAutos(Auto autoNuevo) {
		this.autos.add(autoNuevo);
	}
	public float getSueldo() {
		return sueldo;
	}
	
	private void setSueldo(float sueldo){
		this.sueldo= sueldo;
	}
	public Jugador(float sueldo, int amarillas, int rojas, int goles, String nombre) {
		super();
		this.sueldo = sueldo;
		this.amarillas = amarillas;
		this.rojas = rojas;
		this.goles = goles;
		this.nombre = nombre;
		
	}
	
	private void aumentaSueldo(){
		float is= this.getSueldo() * 0.05f;
		is= is*this.getSueldo();
		this.setSueldo(is);
	}
	
	public void meterGol(int gol){
		int g=this.getGoles();
		g++;
		this.setGoles(g);
		this.aumentaSueldo();
	}
	
	public void tarjetaAmarilla(){
		int aux=this.getAmarillas();
		aux++;
		this.setAmarillas(aux);
	}
	
	public void tarjetaRoja(){
		int aux=this.getRojas();
		aux++;
		this.setAmarillas(aux);
		
	}
	
	private void descontarSueldo(){
		float aux= this.getSueldo() * 0.05f;
		aux= this.getSueldo()-aux;
		this.setSueldo(aux);
	}
	
	public void comprarAuto(Auto autoNuevo){
		this.setAutos(autoNuevo);
	}
	
	
		
}
