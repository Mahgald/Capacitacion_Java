package practica2.ej04;

public class Calculadora {

/*	Declarar una clase "Calculadora" que implemente la Suma, Resta, Multiplicación y División para: 
		Tres numeros enteros
		Dos numeros de punto flotante
		Cuatro numeros de punto flotante
		La misma debe devolver los valores al metodo que los invoca e imprimir por pantalla los valores devueltos.
		Los valores con la que se invocan los métodos se los definira a mano en el programa(NO se pide su ingreso por consola)*/

	public int suma(int num1, int num2, int num3){
		int resultado=num1+num2+num3;
		return resultado;
	}
	public int resta(int num1, int num2, int num3){
		int resultado=num1-num2-num3;
		return resultado;
	}
	public int multiplicacion(int num1, int num2, int num3){
		int resultado=num1*num2*num3;
		return resultado;
	}
	public int division(int num1, int num2, int num3){
		int resultado=num1/num2/num3;
		return resultado;
	}
	
	public float suma(float num1, float num2){
		float resultado=num1+num2;
		return resultado;
	}
	public float resta(float num1, float num2){
		float resultado=num1-num2;
		return resultado;
	}
	public float multiplicacion(float num1, float num2){
		float resultado=num1*num2;
		return resultado;
	}
	public float division(float num1, float num2){
		float resultado=num1/num2;
		return resultado;
	}
	
	public float suma(float num1, float num2,float num3, float num4){
		float resultado=num1+num2+num3+num4;
		return resultado;
	}
	public float resta(float num1, float num2,float num3, float num4){
		float resultado=num1-num2-num3-num4;
		return resultado;
	}
	public float multiplicacion(float num1, float num2,float num3, float num4){
		float resultado=num1*num2*num3*num4;
		return resultado;
	}
	public float division(float num1, float num2,float num3, float num4){
		float resultado=num1/num2/num3/num4;
		return resultado;
	}


}
