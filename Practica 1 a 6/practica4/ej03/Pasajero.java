package practica4.ej03;

public abstract class Pasajero extends Persona {

	/*Pasajero

    Si llega a 100 horas de vuelo y es frecuente, se le da el siguiente mensaje
    "Felcitaciones ud. ha llegado/superado las 100 horas y al ser frecuente se le regala un pasaje a Miami"
    
    Si llega a 100 horas y no es frecuente se le da el siguiente mensaje
    "Felcitaciones ud. ha llegado/superado las 100 horas  se le regala un pasaje a Brasil"
    
    Si no llega a 100 horas se le da el siguiente mensaje:
    "Aun te faltan X cantidad de horas para el premio" se debe calcular X*/
	
	public Pasajero(String nombre, String apellido, int edad) {
		super(nombre, apellido, edad);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean superaHoras(){
		if(this.horasVuelo>100){
			return true;
		}else
			return false;
	}
	
	protected String dormir(){
		return "Me puede trae una manta que quiero dormir y tengo frio";
	}

	@Override
	protected abstract String actualizacionEstado();

	

	

}
