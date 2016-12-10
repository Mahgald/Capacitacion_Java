package practica4.ej01;

public class Pez extends Animal {

	public Pez(float edad, String nombre) {
		super(edad, nombre);
	}

	@Override
	public void comer() {
		this.edad+=(this.edad*0.7f);
	}

	public String nadar(){
		super.rejuvenecer();
		return "Que lindo que es nadar y fumar abajo del agua vieja!";
	}
}
