package practica1.ej09;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		/*
		 * Dado un valor de temperatura por consola y elegida una opcion de
		 * conversion, convertir el valor segun corresponda. Las opciones de
		 * conversion seran:
		 * 
		 * Grados Celsius a Grados Fahrenheit Grados Fahrenheit a Grados Celsius
		 * Grados Kelvin a Grados Celcius
		 * 
		 * 
		 * Dado un valor de distancia por consola y elegida una opcion de
		 * conversion, convertir el valor segun corresponda. Las opciones de
		 * conversion seran:
		 * 
		 * Metros a Pies Kilometros a Millas Centimetros a Pulgadas
		 */

		float fahrenheit;
		float celsius;
		float temp;
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Opcion 1 Convierte Temperaturas");
		System.out.println("Opcion 2 Convierte Medidas");
		int menu = sc.nextInt();
		
		switch (menu) {
		case 1:

			System.out.println("Opcion 1 Centigrados a Fahrenheit");
			System.out.println("Opcion 2 Fahrenheit a Centigrados");
			System.out.println("Opcion 3 Kelvin a Centigrados");
			int op = sc.nextInt();

			switch (op) {
			case 1:
				System.out.println("Ingrese °C");
				temp = sc.nextFloat();
				fahrenheit = 1.8f * temp + 32;
				System.out.println("Se convirtieron " + temp + " °C a " + fahrenheit + " °F");
				break;

			case 2:
				System.out.println("Ingrese °F");
				temp = sc.nextFloat();
				celsius = (temp - 32) / 1.8f;
				System.out.println("Se convirtieron " + temp + " °F a " + celsius + " °C");
				break;

			case 3:
				System.out.println("Ingrese °K");
				temp = sc.nextFloat();
				celsius = temp - 273.15f;
				System.out.println("Se convirtieron " + temp + " °K a " + celsius + " °C");
				break;

			}

			break;

		case 2:

			System.out.println("Opcion 1 Metros a Pies");
			System.out.println("Opcion 2 Kilometros a Millas");
			System.out.println("Opcion 3 Centimetros a Pulgadas");

			int op2 = sc.nextInt();
			float pies, millas, pulgadas, med;

			switch (op2) {
			case 1:
				System.out.println("Ingrese Metros");
				med = sc.nextFloat();
				pies = med * 3.28f;
				System.out.println("Se convirtieron " + med + " metros a " + pies + " pies");
				break;

			case 2:
				System.out.println("Ingrese Kilometros");
				med = sc.nextFloat();
				millas = med * 0.6213f;
				System.out.println("Se convirtieron " + med + " kilometros a " + millas + " millas");
				break;

			case 3:
				System.out.println("Ingrese Centimetros");
				med = sc.nextFloat();
				pulgadas = med * 0.3937f;
				System.out.println("Se convirtieron " + med + " centimetros a " + pulgadas + " pulgadas");
				break;

			}
			break;
		}

		sc.close();

	}
}
