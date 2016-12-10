package practica4.ej03;

public class Piloto extends Persona {
	
/*	Piloto

    Si llega a 30 horas de vuelo, se le da el siguiente mensaje 
    "Felcitaciones ud. ha  llegado/superado las 30 horas de vuelo, tiene una semana de descanso"
    
    Si no llega a 30 horas se le da el siguiente mensaje 
    "Aun te faltan X cantidad de horas para el premio" se debe calcular X.*/
	
	public Piloto(String nombre, String apellido, int edad) {
		super(nombre, apellido, edad);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean superaHoras() {
		if(this.getHorasVuelo()>=30){
			return true;
		}else{
			return false;
		}
	}
	
	protected String despegarAvion(){
		return "Trupulacion lista para despegar";
	}
	
	protected String aterrizarAvion(){
		return "Abrochense los cinturones";
	}

	@Override
	protected String actualizacionEstado() {
		int horas;
		
		if(this.superaHoras()){
			return "Felcitaciones ud. ha  llegado/superado las 30 horas de vuelo, tiene una semana de descanso";
		}else{
			horas= 30-this.horasVuelo;
			return "Aun te faltan " +horas+ " horas para el premio" ;
		}
		
	}
}
