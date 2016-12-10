package practica6.ej01;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeCompras {

	
	private String dir= "C:/Users/ricar/Documents/Escuelita Java Accenture/CapacitacionJavaCaptton/src/practica6/ej01/ListaCompras.txt";
	private File file= new File(dir);

	public ListaDeCompras(){
		if(!this.file.exists()){
			
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}	
	
	public void cargarLista(String producto){
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(this.file,true);
			fw.write(producto+"\n");
			fw.flush();
		}catch (IOException e){
			e.printStackTrace();
		}
		finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	public File getFile(){
		return this.file;
	}
	
	public String imprimirLista(){
		String lista="";
		try {
			Scanner sc = new Scanner(this.file);
			while (sc.hasNextLine()) {
				lista+=sc.nextLine()+"\n";
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lista;
	} 

	
		
	
	public void eliminarProducto(String producto){
		String prod="";
		
		try {
			ArrayList<String> lista= new ArrayList<>();
			Scanner sc = new Scanner(this.file);
			while(sc.hasNextLine()){
				prod=sc.nextLine();
				if(!prod.equalsIgnoreCase(producto)){
					lista.add(prod);
					
				}
				
			}
			this.file.delete();
			for (String produ : lista) {
				this.cargarLista(produ);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
	}

	public void salioDelMercado(){
		
		try {
			if(this.file.getTotalSpace()>0){
			
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
}











