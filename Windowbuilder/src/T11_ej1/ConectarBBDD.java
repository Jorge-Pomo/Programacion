package T11_ej1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConectarBBDD {

	public static void main(String[] args) {
		
		try{
			
		Class.forName("com.mysql.jdbc.Driver");
		Connection conexion = DriverManager.getConnection
				("jdbc:mysql://localhost/bd_almacenescajas","root", "");
		
		Statement s = conexion.createStatement();
		ResultSet rs = s.executeQuery ("SELECT c.*, a.Lugar FROM cajas c INNER JOIN almacenes a ON c.Almacen = a.Codigo");
		
		while (rs.next()){
			
		System.out.println (rs.getString(1) + " "+rs.getString("Contenido")+ " "
		+rs.getInt(3) +rs.getInt(4) +rs.getString(5));
		
		}

		
		} catch (Exception e){
			
		e.printStackTrace();
		
		}
		
	}

}
