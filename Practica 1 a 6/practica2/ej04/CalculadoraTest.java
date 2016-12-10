package practica2.ej04;

public class CalculadoraTest {

	public static void main(String[] args) {

		Calculadora calc= new Calculadora();
		
	
		System.out.println(calc.suma(5, 4, 1));
		System.out.println(calc.resta(5, 3, 1));
		System.out.println(calc.multiplicacion(5, 6, 7));
		System.out.println(calc.division(5, 50, 2));
		System.out.println("");
		System.out.println(calc.suma(5.5f, 2f));
		System.out.println(calc.resta(5f, 3f));
		System.out.println(calc.multiplicacion(5f, 6f));
		System.out.println(calc.division(5f, 50f));
		System.out.println("");
		System.out.println(calc.suma(5.5f, 2f,12f,22.2f));
		System.out.println(calc.resta(5f, 3f,12f,22.2f));
		System.out.println(calc.multiplicacion(5f, 6f,12f,22.2f));
		System.out.println(calc.division(5f, 50f,12f,22.2f));
	}

}
