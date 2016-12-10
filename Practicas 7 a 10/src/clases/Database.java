package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.Driver;

// 1 - Importar el paqueta java.sql.*
// 2 - Registar el driver  Class.forName("com.mysql.jdbc.Driver")
// 3 - Abrir la conexion DriverManager.getConnection(URL,USER,PASS)
// 4 - Ejecutar la query statement.executeQuery o execute (consulta)
// 5 - Tomamos los resultados con ResultSet rs; rs.next();
// 6 - Cerrar la conexion rs.close(), statement.close(); connection.close()

public class Database {
	
	private static String URL = "jdbc:mysql://localhost:3306/db_captton";
	private static String USER = "root";
	private static String PASS = "1234";
	
	
	private static Connection conectar(){
		Connection cn = null;	
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection(URL,USER,PASS);
		
		} catch (SQLException e) {
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		}
		return cn;
	}

	public static ArrayList<Productos> obtenerProductos(){
			ArrayList<Productos> lista = new ArrayList<>();
			Statement stmt= null;
			ResultSet rs = null;
			Connection cn = conectar();
			
			try {
				stmt=cn.createStatement();
				rs= stmt.executeQuery("SELECT * FROM Productos");
				while(rs.next()){
					Productos p = new Productos(rs.getLong("id"), rs.getString("nombre"), rs.getString("tamaño"), rs.getInt("precio"));
					lista.add(p);
				}
				
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					rs.close();
					stmt.close();
					cn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		return lista;
	}
	
	
	
	
}
