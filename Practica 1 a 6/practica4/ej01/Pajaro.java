package practica4.ej01;

public class Pajaro extends Animal {

	public Pajaro(float edad, String nombre) {
		super(edad, nombre);
	}

	@Override
	public void comer() {
		this.edad+=(this.edad*0.3f);
	}
	
	public String volar(){
		super.rejuvenecer();
		return "A la gilada ni cabida yo la miro desde arriba!";
	}

}
