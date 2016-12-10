package practica6.ej03;

public class Organizador{
	boolean flag;
	
	public Organizador()
	{}

	public String subirTelon()
	{
		flag=Telon.getInstancia().subir();
		if(flag==true)
			return "El telón a está levantando";
		else
			return "El telón ya está levantado";
	}
	
	public String bajarTelon()
	{
		flag=Telon.getInstancia().bajar();
		if(flag==true)
			return "El telón está bajando";
		else
			return "El telón ya está bajo";
	}
}
