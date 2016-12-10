package practica1.ej02;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*
		 Escribir un programa que pida el ingreso de un numero entero y 
		 que indiquere si se trata de un numero par o un numero impar.
		Utilizar el operador de módulo (%)
		  */

		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Ingrese un numero");
		num= sc.nextInt();
		sc.close();
		if (num%2==0) {
			System.out.println("Es par");
		}else{
			System.out.println("Es impar");
		}
		
		
		
		
		
	}

}
