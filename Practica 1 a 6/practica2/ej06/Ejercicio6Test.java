package practica2.ej06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio6Test {

	public static void main(String[] args) {
		/*	Declarar una lista y pedir por consola 10 valores separados por coma para la misma. Luego de cargar la lista, utilizar 
		los metodos provistos por las mismas para ordenarla y mostrar uno a uno los valores contenidos. Pueden ser numeros, palabras, etc.*/
		
		
		ArrayList<String> listaNombres= new ArrayList();
		Scanner sc= new Scanner(System.in);
		String nombres;
		
		System.out.println("Ingrese los nombres separados por coma");
		
		nombres= sc.nextLine();
		String [] arregloNombres= nombres.split(",");
		for (int i = 0; i < arregloNombres.length; i++) {
			listaNombres.add(arregloNombres[i]);
		}
		Collections.sort(listaNombres);
		System.out.println();
		for(String nomb: listaNombres){
			System.out.println("Persona nombre "+nomb);
		}

	}

}
