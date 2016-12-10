package practica1.ej08;


public class Ejercicio8 {

	public static void main(String[] args) {
		/*Pidiendo una palabra o frase por consola comprobar si la misma es un palíndromo o no. 
		 * Informar el resultado.

		Los palindromos son aquellas palabras que se leen de igual manera de izquierda a derecha 
		y de  derecha a izquierda. 
		Cuando hablamos de frases, no se cuentan las puntuaciones ni los espacios.

		Ejemplo de palíndromo: Neuquen, Anita lava la tina*/
		
		String palabra;
	
		palabra="soneteetenos";
				
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
			System.out.println("Es palindromo");
		}else{
			System.out.println("No es palindromo");
		}
		
		
		
		
	//	sc.close();
		
		
		
		
		
		
	}
}
