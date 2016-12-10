package practica6.ej04;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestEjercicio4 {

	public static void main(String[] args)
	{
		String dir="/home/alumno/Documents/Java Noviembre 2016/demoClase1/src/practica6/ej04/Libros.txt";
		File file=new File(dir);
		String[] datos;
		ArrayList<Libro> libros=new ArrayList<>();
		ArrayList<Libro> librosF=new ArrayList<>();
		
		
		try //lectura
		{
			String libro;
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine())
			{
				libro=sc.nextLine();
				datos = libro.split(";");
				libros.add(new Libro(datos[0],datos[1],datos[2],datos[3]));
			}
			sc.close();		
		}
		catch (Exception e)
		{e.printStackTrace();
		}
		
		Collections.sort(libros);
	    
	    
		for (int i = 0; i < libros.size(); i++)
		{
			System.out.println(libros.get(i).toString());
		}
	}
}



