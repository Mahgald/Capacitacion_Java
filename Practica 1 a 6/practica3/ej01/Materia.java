package practica3.ej01;

public class Materia {
	
	private String nombre;
	private int cargaHoraria;
	private boolean promocionable;
	private float remuneracion;
	private int nota;
	
	
	public Materia(String nombre, int cargaHoraria, boolean promocionable, float remuneracion) {
		super();
		this.nombre = nombre;
		this.nota=0;
		this.cargaHoraria = cargaHoraria;
		this.promocionable = promocionable;
		this.remuneracion = remuneracion;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public boolean isPromocionable() {
		return promocionable;
	}
	public void setPromocionable(boolean promocionable) {
		this.promocionable = promocionable;
	}
	public float getRemuneracion() {
		return remuneracion;
	}
	public void setRemuneracion(float remuneracion) {
		this.remuneracion = remuneracion;
	}
	
	
	
}
