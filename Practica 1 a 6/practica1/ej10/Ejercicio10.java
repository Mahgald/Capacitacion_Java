package practica1.ej10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*Determinar que puntaje extra le corresponde a un jugador luego de pedirle que ingrese dicho valor.
		Los puntajes ingresados iran de 0 a 9.

	    Si el puntaje ingresado esta entre 1 y 3 inclusive, le suma 10 veces el puntaje ingresado
	    Si el puntaje ingresado esta entre 7 y 9 inclusive, le suma 1000 veces el puntaje ingresado
	    Para puntajes mayores a 9 ó 0, se emitira un mensaje de error
	*/
	
		Scanner sc= new Scanner(System.in);
		
		int menu=-1;
		
		
		System.out.println("Ingrese el puntaje del jugador (Digitos del 0 al 9)");
		int score= sc.nextInt();
		
		if (score>=1 && score<=3) {
			menu=1;
		}if (score>=7 && score<=9) {
			menu=2;
		}else{
			if(score>9 || score==0) {
				menu=0;
			}
		}	
				
		switch (menu) {
		case 0:
			System.out.println("El puntaje del jugador no es valido ");
		break;

		case 1:
			score= score*10;
			System.out.println("El puntaje del jugador es "+score);
		break;
		
		case 2:
			score= score*1000;
			System.out.println("El puntaje del jugador es "+score);
		break;
		}
		
		
		sc.close();
		
		
	
	}
}
