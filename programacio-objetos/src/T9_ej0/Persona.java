package T9_ej0;

import T6_ej1.Coche;

public class Persona {

	// Atributos
	private String nombre;
	private int edad;
	private Coche c;

	// Constructors
	public Persona() {

	}

	public Persona(String nombre) {
		this.nombre = nombre;
		this.edad = 0;
		this.c = null;
	}

	public Persona(String nombre, int edad, Coche c) {
		this.nombre = nombre;
		this.edad = edad;
		this.c = c;
	}

	// Gettes && Setters
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

}
