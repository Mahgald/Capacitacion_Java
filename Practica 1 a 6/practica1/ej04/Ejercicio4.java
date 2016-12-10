package practica1.ej04;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
	/*	Escribir un programa que pida un numero y calcule la sumatoria y 
	 	el promedio de todos los numero hasta el ingresado.
		Ejemplo: Se ingresa 3. El programa deberá mostrar:
		La sumatoria es: 6
		El promedio es: 2*/

		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Ingrese un numero");
		num= sc.nextInt();
		int sumatoria,promedio;
		sumatoria= (num*(num + 1)/2);
		promedio= sumatoria/num;
		sc.close();		  
		
		System.out.println("La sumatoria hasta el "+num+" Es "+ sumatoria);
		System.out.println("El promedio es "+ promedio);
		
	}	
}
