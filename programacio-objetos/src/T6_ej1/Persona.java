package T6_ej1;

public class Persona {

	private String nombre;
	private int edad;
	private Coche c;
	
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

	public void setC(Coche c) {
		this.c = c;
	}
	public Coche getC() {
		return c;
	}
	
	public Persona() {

	}

	public Persona(String nombre) {
		this.nombre = nombre;
		this.edad = 0;
		this.c = null;
	}

}
