package practica3.ej03;

public class Ejercicio3Test {

	public static void main(String[] args) {
/*		Analice el objeto Cuenta Bancaria. Piense en caracteristicas y acciones que se le puedan atribuir al mismo. 
 * 		En base a lo analizado, modele la clase que lo representa con sus atributos y métodos correspondientes.

		Utilice la clase para dar de alta una lista de Cuentas Bancarias.

		Modelar un objeto Cliente, un objeto Banco y un objeto Tarjeta de Débito. Establecer las relaciones de Asociacion,
		 Agregación o Composición que puedan existir entre los cuatro objetos.

		Implementar las clases para los modelos pensados y hacer un programa donde se construya un banco con 
		tres clientes utilizando todas las clases definidas
		Los valores pueden ser pasados directamente por código, no hace falta pedir su ingreso manual. */
		
		Banco b1 = new Banco("Banco Provincia", "7 y 51", "La Plata");
		
		Cliente c1 = new Cliente("Juan", "Perez", "2222222");
		Cliente c2 = new Cliente("Carlos", "Lopez", "33333333");
		Cliente c3 = new Cliente("Matias", "Gomez", "4444444444");

		b1.nuevoCliente(c1);
		b1.nuevoCliente(c2);
		b1.nuevoCliente(c3);
	
		System.out.println("El banco tiene "+b1.getClientes().size()+" Clientes");
		
		for (Cliente cliente : b1.getClientes()) {
			System.out.println(cliente.toString()+"\n");
		}
	
	
	
	
	}

}
