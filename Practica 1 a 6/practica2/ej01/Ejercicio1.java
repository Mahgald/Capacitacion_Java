package practica2.ej01;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Reescribir el Ejercicio 7 utilizando una lista en vez de un vector
		/*Partiendo de un array de numeros declarado estaticamente, 
		 ordenar el mismo y mostrar el resultado del array ordenado
		 */
		
		LinkedList<Integer> lista =new LinkedList<>();
		Random r= new Random();
		
		for (int i = 0; i < 10; i++) {
			lista.add(r.nextInt(123456789));
		}
		
		for (int item:lista) {
			System.out.println("Lista Desordenada "+item);
		}
		
				
		Collections.sort(lista);
		
		System.out.println("");
		for (int item:lista) {
			System.out.println("Lista Ordenada "+item);
		}
		
	
	}

}
