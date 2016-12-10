package practica4.ej01;

public class TestAnimal {

	/*En un Zoologico especial existen tres tipos de animales, Perros, Peces y Pajaros.

	Cada mascota tiene un nombre, ademas se sabe que:

	    Cada mascotas tiene una edad en años. (DEFINIR la edad como flotante) .
	    Cuando Comen: Los Pajaros aumentan un 30% del alimento ingerido, Los Perros un 50% y los Peces un 70%.
	    Los Peces "Nadan" y mientras nadas piensan "Que lindo es nadar" (escribir esto por la consola), 
	    los Perros "Ladran" y piensan "Me relaja ladrar!" (escribir esto por la consola) 
	    y los pajaros "Vuelan" y piensan "Desde Arriba todo es bello!" 
	    (escribir esto por la consola) ... todas estas ACCIONES (Ladrar, Nadar y Volar) 
	    las deben resolver en cada clase en particular y no puede ser heredada de la abstracta.
	    Cada vez que "Nadan","Ladran" y Vuelan" ellos disfrutan tanto que rejuvenecen un 10% de su edad.

	Recuerden que un Metodo Abstracto puede tener parametros de entrada.


	A tener en cuenta INTERESANTE pero NO OBLIGATORIO:

	Se puede utilizar todos los  Atributos PROTECTED en vez de PRIVATE
	en la clase ABSTRACTA si así lo desean, de esta manera al heredar la clase abstracta 
	podrán acceder desde los metodos de la clase HIJA con THIS.Atributo a los atributos heredados 
	y ahorrarse un paso de llamar a metodos de la clase PADRE para modificar EDAD y PESO.
	*/
	
	
	public static void main(String[] args) {
		Pajaro pajarito= new Pajaro(10, "Pepito");
		Perro perrito= new Perro(20, "Cachete");
		Pez pescadito= new Pez(5, "Nemo");
		
		System.out.println("El " +pajarito.getNombre() +" tiene "+ pajarito.getEdad());
		System.out.println("El " +pajarito.getNombre() +" esta comiendo");
		pajarito.comer();
		System.out.println("El "+pajarito.getNombre() +" esta lleno "+ pajarito.getEdad());
		System.out.println(pajarito.volar()+" Nueva edad " + pajarito.getEdad());
		
		System.out.println();
		
		System.out.println("El "+perrito.getNombre() +" tiene "+ perrito.getEdad());
		System.out.println("El "+perrito.getNombre() +" esta comiendo ");
		perrito.comer();
		System.out.println("El "+perrito.getNombre() +" esta lleno "+ perrito.getEdad());
		System.out.println(perrito.ladrar()+" Nueva edad"+ perrito.getEdad());
		
		System.out.println();
		
		System.out.println("El "+pescadito.getNombre() +" tiene "+ pescadito.getEdad());
		System.out.println("El "+pescadito.getNombre() +" esta comiendo");
		pescadito.comer();
		System.out.println("El "+pescadito.getNombre() +" esta lleno "+ pescadito.getEdad());
		System.out.println(pescadito.nadar()+" Nueva edad "+ pescadito.getEdad());
	}

}
