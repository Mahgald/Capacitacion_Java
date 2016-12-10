package practica1.ej01;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
/*
 Pedir el ingreso de nombre y edad y guardar ambos valores en variables. 
 Mostrar un mensaje de bienvenida que contenga ambos valores.
  */
		
		Scanner sc= new Scanner(System.in);
		String nombre;
		int edad;
		
		System.out.println("Ingrese su nombre");
		nombre= sc.nextLine()+" ";
		System.out.println("Ingrese su edad");
		edad= sc.nextInt();
		
		System.out.println("Bienvenido "+ nombre + " con edad de "+ edad + " años");
		sc.close();
	
	}

}
