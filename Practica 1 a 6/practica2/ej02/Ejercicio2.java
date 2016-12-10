package practica2.ej02;

import java.util.Scanner;

public class Ejercicio2 {

	/*Convertir el Ejercicio 8 de la Clase 1 en un método e invocarlo utilizando distintas palabras y frases desde el main.
	Mostrar por consola el resultado de las llamadas.*/
	
	/*Pidiendo una palabra o frase por consola comprobar si la misma es un palindromo o no. 
	 * Informar el resultado.

	Los palindromos son aquellas palabras que se leen de igual manera de izquierda a derecha 
	y de  derecha a izquierda. 
	Cuando hablamos de frases, no se cuentan las puntuaciones ni los espacios.

	Ejemplo de palindromo: Neuquen, Anita lava la tina*/
	
	private String palabra;
	private Scanner sc= new Scanner(System.in);
	
	
	
	public String getPalabra() {
		return palabra;
	}



	public boolean esPalindromo(){
		this.palabra=sc.nextLine();
		this.palabra=this.palabra.toLowerCase();
		this.palabra=this.palabra.replaceAll(" ", "");
		
		boolean ok=true;
		
		int i=palabra.length()-1;
		int j=0;
		
		while(ok && j<i){
			if((palabra.charAt(j))==(palabra.charAt(i))){
				i--;
				j++;
			
			}else{
				ok=false;
			}
		}
		if(ok){
			return ok;
		}else{
			return ok;
		}
	}
	
	
	
}
