package practica4.ej03;

public class Azafata extends Persona  {

/*	Azafata

    Si llega a 50 horas de vuelo, se le da el siguiente mensaje 
    "Felcitaciones ud. ha  llegado/superado las 50 horas, tiene un bonus del 20% de su sueldo" 
  
    Si no llega a 50 horas se le da el siguiente mensaje 
    "Aun te faltan X cantidad de horas para el premio" se debe calcular X.*/
	
	
	public Azafata(String nombre, String apellido, int edad) {
		super(nombre, apellido, edad);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean superaHoras() {
		if(this.horasVuelo >=50){
			return true;
		}else
			return false;
	}

	protected String servirComida(){
		return "¿Pollo o Pasta?";
	}

	@Override
	protected String actualizacionEstado() {
		int horas;
		if(this.superaHoras()){
			return "Felcitaciones ud. ha  llegado/superado las 50 horas, tiene un bonus del 20% de su sueldo";
		}else
			horas= 50-this.horasVuelo;
			return "Aun te faltan "+horas+" horas para el premio";
	}

	
}
