package program;

import enterprise.Empresa;
import enterprise.Factura;
import products.Electronico;
import products.Producto;
import products.Servicio;
import provider.Proveedor;

public class ProyectoTest {

	public static void main(String[] args) {
		
		Proveedor nvidia = new Proveedor("Nvidia");
		Empresa evga = new Empresa("EVGA", "Capital Federal", nvidia);
		Cliente cli1 = new Cliente("Marcelo", "Gallardo", 22222222);
		Cliente cli2 = new Cliente("Andres", "Dalessandro", 33333333);
		Cliente cli3 = new Cliente("Lucas", "Alario", 44444444);
		
		evga.initialize();
		
		System.out.println("===================================================================================");
		System.out.println("=======================IMPRIMIENDO PRODUCTOS ANTES DE VENDER=======================");
		System.out.println("===================================================================================");
		System.out.println();
		for (Producto producto : evga.getProductos()) {
			if(producto.getClass().equals(Electronico.class)){
				System.out.println(((Electronico)producto).toString());
				System.out.println("Stock Inicial "+evga.getStocks().get(evga.getProductos().indexOf(producto)));
				System.out.println();
			}else{
				System.out.println(((Servicio)producto).toString());
				
			}
			
		}
		System.out.println();
		
		System.out.println("===================================================================================");
		System.out.println("==========================IMPRIMIENDO FACTURA======================================");
		System.out.println("===================================================================================");
		System.out.println();
		Factura venta= evga.nuevaFactura(cli2);
		System.out.println(evga.imprimirFactura(venta));
		
		System.out.println("===================================================================================");
		System.out.println("=======================IMPRIMIENDO PRODUCTOS DESPUES DE VENDER=====================");
		System.out.println("===================================================================================");
		System.out.println();
		for (Producto producto : evga.getProductos()) {
			if(producto.getClass().equals(Electronico.class)){
				System.out.println(((Electronico)producto).toString());
				System.out.println("Stock Final "+evga.getStocks().get(evga.getProductos().indexOf(producto)));
				System.out.println();
			}
			
		}
	}

}
