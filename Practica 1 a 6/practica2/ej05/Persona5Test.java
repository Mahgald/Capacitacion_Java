package practica2.ej05;

import java.util.Scanner;

public class Persona5Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc= new Scanner(System.in);
		
		Persona p1= new Persona(sc.nextLine(), sc.nextLine(), sc.nextInt());
		sc.close();
		System.out.println(p1.toString());
		
	}
}
