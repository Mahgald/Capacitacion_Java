package practica4.ej01;

public abstract class Animal {
	
	protected float edad;
	protected String nombre;
	
	public Animal(float edad, String nombre) {
		this.edad = edad;
		this.nombre = nombre;
	}

	public abstract void comer();
	
	public void rejuvenecer(){
		this.edad -=(this.edad*0.10f);
	};

	public float getEdad() {
		return edad;
	}
	
	public void setEdad(float edad) {
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	
	
	
}
