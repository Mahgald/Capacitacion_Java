package practica2.ej03;

public class Auto {
	private String marca;
	private String modelo;
	private float valor;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public Auto(String marca, String modelo, float valor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", modelo=" + modelo + ", valor=" + valor + "]";
	}
	
	
	
	
	
}
