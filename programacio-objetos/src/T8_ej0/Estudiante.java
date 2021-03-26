package T8_ej0;

import T6_ej1.Coche;

public class Estudiante extends Persona {

	// Atributos
	private int numeroExpediente;
	private String cursoActual;
	private double[] notas = new double[7];

	// Constructor
	Estudiante() {

	}

	Estudiante(String nombre, int edad, Coche c, int numeroExpediente, String cursoActual) {
		super(nombre, edad, c);
		this.numeroExpediente = numeroExpediente;
		this.cursoActual = cursoActual;
	}

	// Getters && Setters
	public void setNumeroExpediente(int numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}

	public int getNumeroExpediente() {
		return numeroExpediente;
	}

	public void setCursoActual(String cursoActual) {
		this.cursoActual = cursoActual;
	}

	public String getCursoActual() {
		return cursoActual;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double[] getNotas() {
		return notas;
	}

	// Metodos
	public double getNotaMedia() {
		double media = 0;

		for (int i = 0; i < notas.length; i++) {
			media = notas[i] + media;
		}
		media = media / notas.length;

		return media;
	}
}
