package T9_ej0;

import java.util.Scanner;

import T6_ej1.Coche;

public class Estudiante extends MiembroUPV {

	// Atributos
	private int numeroExpediente;
	private String cursoActual;
	private double[] notas = new double[7];

	// Constructor
	Estudiante() {

	}

	Estudiante(String nombre, int edad, Coche c, String carnet, int numeroExpediente, String cursoActual) {
		super(carnet, nombre, edad, c);
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
	
	@Override
	public void menuIntranet() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Bienvenido al menú Intranet estudiante, seleccione la operación que desea hacer:%n1-Ver expediente estudiante%n2-¿A qué actividades deportivas desea apuntarse?%n3-SALIR%n");
		switch (sc.nextInt()) {
		case 1:
			System.out.println(super.getNombre());
			System.out.println(super.getEdad());
			System.out.println(numeroExpediente);
			System.out.println(cursoActual);
			break;

		case 2:
			System.out.println("Introduzca las actividades a las que quieras apuntarte:");
			sc.nextLine();
			break;
		case 3:
			System.out.println("HASTA LUEGO! Gracias por utilizar la Intranet de estudiante");
			break;
		}
	}
	
}
