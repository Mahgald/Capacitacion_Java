package practica6.ej03;

public class Telon {
	private boolean			bajado;

	private static Telon	instancia;
	{
		bajado = true;
	}

	public static Telon getInstancia()
	{
		if (instancia == null)
		{
			instancia = new Telon();
		}
		return instancia;
	}

	public boolean subir()
	{
		if (bajado == true)
		{
			bajado = false;
			return true;
		}
		else
			return false;
	}
	
	public boolean bajar()
	{
		if (bajado == false)
		{
			bajado = true;
			return true;
		}
		else
			return false;
	}
}
