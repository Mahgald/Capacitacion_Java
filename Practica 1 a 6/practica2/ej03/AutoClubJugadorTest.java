package practica2.ej03;

public class AutoClubJugadorTest {
	public static void main(String[] args) {
		/*Analizar los  objetos: Club(de futbol), Jugador y Auto.
		Modelar las clases correspondientes al analisis hecho.

		Los Analistas Sr. del proyecto analizaron dichos objetos y agregan estas definiciones a tener en cuenta

		Un Club de futbol tiene muchos jugadores en el plantel
		Un jugador ficha en un club y solo pertenece a un club.
		El jugador tiene un Salario
		Su Salario mensual aumenta cada vez que mete un gol en un 5%
		Su Salario disminuye un 5% cuando obtiene una tarjeta roja.
		Un Jugador puede comprar mas de un auto
		Se requieren realizar las siguientes consultas:

		Lista de Jugadores de un Club
		Lista de Autos de un Jugador.
		ADICIONAL EXTRA No Obligatorio:

		El Club quiere saber la suma de tarjetas amarillas de todo el plantel*/
		
		
		Club river= new Club("River Plate", 0, 0);
		Jugador j1= new Jugador(15.000f, 0, 0, 0, "Lavezzi");
		Jugador j2= new Jugador(55.000f, 0, 0, 0, "Di Maria");
		Jugador j3= new Jugador(205.000f, 0, 0, 0, "Messi");
		Jugador j4= new Jugador(155.05f, 0, 0, 0, "CR7");
		
		river.nuevoJugador(j1);
		river.nuevoJugador(j2);
		river.nuevoJugador(j3);
		river.nuevoJugador(j4);
		
		Auto a1= new Auto("Mercedes", "El mas pistola", 255220f);
		Auto a2= new Auto("Mercedes", "El mas o menos", 12354f);
		Auto a3= new Auto("Mercedes", "El mas mejor que peor", 20000f);
		Auto a4= new Auto("Mercedes", "El peor", 10000f);
		
		j1.comprarAuto(a2);
		j1.comprarAuto(a4);
		j2.comprarAuto(a2);
		j3.comprarAuto(a1);
		j3.comprarAuto(a3);
		j4.comprarAuto(a1);
		
		j3.meterGol(4);		j3.meterGol(4);		j3.meterGol(4);
		j4.meterGol(7);
		j1.tarjetaRoja();
		j1.tarjetaRoja();
		j2.tarjetaAmarilla();j2.tarjetaAmarilla();j2.tarjetaAmarilla();j2.tarjetaAmarilla();j2.tarjetaAmarilla();
		j1.tarjetaAmarilla();
		river.actualizarTarjetas();
		
		System.out.println("Total de amarillas "+river.getTotalAmarillas());
		System.out.println();
		System.out.println("Total de rojas "+river.getTotalRojas());
		for(Auto cars: j3.getAutos()){
			System.out.println("El Jugador "+j3.getNombre()+" Tiene los siguientes autos");
			System.out.println(cars.toString());
		}
		
		 
	}
}
