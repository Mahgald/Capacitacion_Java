package practica6.ej01;

public class TestListaCompras {

/*	Crear manualmente un archivo listaCompras.txt en la carpeta de su proyecto y 
	cargarlo con productos a comprar en un supermercado, uno en cada linea del archivo.
	Leer dicho archivo y mostrar la lista por pantalla. Cuando el usuario  "haya conseguido" 
	uno de los objetos de la lista,
	se debe quitar de la misma y volver a imprimir por pantalla los productos faltantes. 
	Si el usuario "sale del supermercado" sin haber conseguido alguno de los productos, 
	se debe crear un nuevo archivo (productosFaltantes.txt) con los productos que quedaron pendientes.*/
	
	public static void main(String[] args) {
		ListaDeCompras lc= new ListaDeCompras();
		
		/*lc.cargarLista("Papa");
		lc.cargarLista("Lechuga");
		lc.cargarLista("Tomate");
		lc.cargarLista("Carne");
		lc.cargarLista("Arroz");
		lc.cargarLista("berenjena");
		lc.cargarLista("azucar");
		lc.cargarLista("yerba");*/
		
		
		String borrar= "yerba";
		
		
		
		System.out.println(lc.imprimirLista());
		
		lc.eliminarProducto(borrar);
		System.out.println("");
	//	System.out.println(lc.imprimirLista());
		//lc.salioDelMercado();
	}

}
