package practica1.ej05;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
	    Calcula la potencia dado una base y un exponente utilizando el búcle WHILE
	    Calcula la potencia dado una base y un exponente utilizando el búcle FOR*/
	
		int base,exp;
		int rslt,i;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese la base");
		base=sc.nextInt();
		System.out.println("Ingrese el exponente");
		exp=sc.nextInt();
		sc.close();
		rslt= base;
		for (int x = 1; x < exp; x++) {
			rslt= rslt * base;
			
		}
		System.out.println(base+" a la "+exp+" = "+rslt);
		
		i=1;
		rslt=base;
		while (i <exp) {
			rslt=rslt * base;
			i++;
		}
		System.out.println(base+" a la "+exp+" = "+rslt);
		
	}
}
