package practica4.ej01;

public class Perro extends Animal {

	public Perro(float edad, String nombre) {
		super(edad, nombre);
	}

	@Override
	public void comer() {
		this.edad+=(this.edad*0.5f);
	}
	
	public String ladrar(){
		super.rejuvenecer();
		return "Como me relaja ladrar vieja!";
	}

}
