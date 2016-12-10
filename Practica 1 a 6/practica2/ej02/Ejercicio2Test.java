package practica2.ej02;

public class Ejercicio2Test {

	public static void main(String[] args) {
		Ejercicio2 ej2 = new Ejercicio2();
		
		System.out.println(" Ingrese una frase o palabra");
		if (ej2.esPalindromo()) {
			System.out.println(ej2.getPalabra()+" Es palindromo");
		}else{
			System.out.println(ej2.getPalabra()+" NO es palindromo");
		}

	}

}
