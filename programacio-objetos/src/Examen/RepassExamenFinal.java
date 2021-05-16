package Examen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RepassExamenFinal {

	// Atributos

	// Tipo de BBDD y URL de la misma
	private String url;
	private String user;
	private String passwd;

	private String consulta;

	// Construcotres
	RepassExamenFinal() {
		url = "jdbc:mysql://localhost/bd_almacenescajas";
		user = "root";
		passwd = "";
		consulta = "SELECT c.*, a.Lugar FROM cajas c INNER JOIN almacenes a ON c.Almacen = a.Codigo";
	}

	RepassExamenFinal(String url, String user, String passwd, String conuslta) {
		this.url = url;
		this.user = user;
		this.passwd = passwd;
		this.consulta = consulta;
	}

	// Getters && Setters
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getConsulta() {
		return consulta;
	}

	public void setConsulta(String consulta) {
		this.consulta = consulta;
	}

	// Metodos
	public void HacerConsulta() {

		try {

			//Nombre y tipo de BBDD
			Class.forName("com.mysql.jdbc.Driver");
			
			//tipo de BBDD, url de la BBDD, usuario y contraseña
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd_almacenescajas", "root", "");

			//Creamos conexion
			Statement s = conexion.createStatement();
			
			//Hacemos la consulta y guardamos el resultado
			ResultSet rs = s
					.executeQuery("SELECT c.*, a.Lugar FROM cajas c INNER JOIN almacenes a ON c.Almacen = a.Codigo");

			//Mientras que haya datos, entre al bucle
			while (rs.next()) {

				//Muestar los siguientes datos extraidos de la consulta
				System.out.println(rs.getString(1) + " " + rs.getString("Contenido") + " " + rs.getInt(3) + rs.getInt(4)
						+ rs.getString(5));

			}

			//Guardamos las excepciones en e
		} catch (Exception e) {

			e.printStackTrace();

		}

	}
}
