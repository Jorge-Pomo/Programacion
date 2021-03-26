package T6_ej0;

public class Persona {

	private String nombre;
	private int edad;

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}

	public Persona() {

	}

	public Persona(String nombre) {
		this.nombre = nombre;
		this.edad = 0;
	}

}
