package practica1.ej07;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*Partiendo de un array de números declarado estaticamente, 
		 ordenar el mismo y mostrar el resultado del array ordenado
		 */
		
		int [] array = {99,3,5574,54,87,33,59,120,215,22,11};
		int aux;
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i]>array[j]) {
					aux=array[i];
					array[i]=array[j];
					array[j]=aux;
				} 
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}
}
