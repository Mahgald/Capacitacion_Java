package practica1.ej03;

import java.util.Scanner;

public class Ejericio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
	 Pedir el ingreso de un número del 0 al 9 e imprimir el nombre en letras del mismo

	Ejemplo: Ingresamos 2 y se nos responde con el mensaje DOS
	  
	  */
	
		Scanner sc = new Scanner(System.in);
		int num;
		String [] numeros = {"cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};
		
		System.out.println("Ingrese un digito del 0 al 9");
		num = sc.nextInt();
		if(num >9 || num<0){
			System.out.println("El nro ingresado no es un digito");
			
		
		}else{
			System.out.println(numeros[num]);
		}
		sc.close();
	}
	
}
