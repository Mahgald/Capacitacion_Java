package practica6.ej04;

public class Libro implements Comparable<Libro>
{
	private String titulo;
	private String autor;
	private String editorial;
	private String añoPublicacion;
	
	//
	
	public Libro(String titulo,String autor,String editorial,String añoPublicacion)
	{
		this.titulo=titulo;
		this.autor=autor;
		this.editorial=editorial;
		this.añoPublicacion=añoPublicacion;
	}

	public String getTitulo()
	{
		return titulo;
	}

	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}

	public String getAutor()
	{
		return autor;
	}

	public String getEditorial()
	{
		return editorial;
	}

	public void setEditorial(String editorial)
	{
		this.editorial = editorial;
	}

	public String getAñoPublicacion()
	{
		return añoPublicacion;
	}

	public void setAñoPublicacion(String añoPublicacion)
	{
		this.añoPublicacion = añoPublicacion;
	}

	public void setAutor(String autor)
	{
		this.autor = autor;
	}
	
	public String toString()
	{
		return this.titulo+"\t"+this.autor+"\t"+this.editorial+"\t"+this.añoPublicacion+"\n";
	}

	@Override
	public int compareTo(Libro arg0)
	{
		return this.titulo.compareTo(arg0.titulo);
	}


}
