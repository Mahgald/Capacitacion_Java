package practica1.ej06;

import java.util.Scanner;

public class Ejericio6 {

	public static void main(String[] args) {
		/*A partir de un array de elementos, buscar si un valor se encuentra dentro del mismo. 
		En caso que se encuentre, mostrar la posición en la cual fue encontrado. 
		De lo contrario, mostrar -1*/
		
		
		int [] array= {2,4,6,8,10,12,14,16,18,20};
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Ingrese el nro del cual quiere saber posicion");
		int buscado= sc.nextInt();
		int i=0;
		boolean ok= false;
		while (ok !=true && i<array.length) {
			
		
			if (buscado == array[i]) {
				
				ok=true;
			}else{
				i++;
			}
			
		}
		if(ok){
			System.out.println("El numero buscado esta en la posicion " + i);
		}
		else{
			System.out.println("El numero buscado esta en la posicion -1");
		}
		
		sc.close();

	}
}
