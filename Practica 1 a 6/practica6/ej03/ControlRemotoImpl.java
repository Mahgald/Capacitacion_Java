package practica6.ej02;

public class ControlRemotoImpl implements IControlRemoto {

	public static int telon;
	public static boolean luz;
	
	public ControlRemotoImpl() {
		telon=0;
		luz=false;
	}
	
	
	@Override
	public void abrirTelon() {
		if(this.telon<=10){
			telon++;
		}
	}

	@Override
	public void cerrarTelon() {
		if(this.telon>0){
			telon--;
		}

	}

	@Override
	public void prenderLuces() {
		if(!luz){
			luz=true;
		}

	}

	@Override
	public void apagarLuces() {
		if(luz){
			luz=false;
		}

	}

}
