package T8_ej2;

import T6_ej1.Coche;

public class Profesor extends Persona {
	// Atributos
	private String despacho;
	private String horarioTutorias;

	// Constructor
	public Profesor(String nombre, int edad, Coche c, String despacho, String horarioTutorias) {
		super(nombre, edad, c);
		this.despacho = despacho;
		this.horarioTutorias = horarioTutorias;
	}

	// Getters && Setters
	public String getDespacho() {
		return despacho;
	}

	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}

	public String getHorarioTutorias() {
		return horarioTutorias;
	}

	public void setHorarioTutorias(String horarioTutorias) {
		this.horarioTutorias = horarioTutorias;
	}

	// Metodos
	public String getConsultas() {
		return getNombre() + " tiene tutoria los " + horarioTutorias + " en la sala de " + despacho;
	}
}
