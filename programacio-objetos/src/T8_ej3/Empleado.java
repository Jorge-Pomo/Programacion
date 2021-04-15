package T8_ej3;

public class Empleado {

	//Atributos
	private String nombre;
	
	//Constructor
	public Empleado() {
		
	}
	
	public Empleado(String nombre) {
		this.nombre = nombre;
	}
	
	//Getters && Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Metodos
	public String toString() {
		return nombre + " es un objeto de la clase Empleado";
	}
}
