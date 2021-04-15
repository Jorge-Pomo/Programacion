package T9_ej0;

import java.util.Scanner;

import T6_ej1.Coche;

public class Profesor extends MiembroUPV {
	// Atributos
	private String despacho;
	private String horarioTutorias;
	private int nomina;

	// Constructor
	public Profesor(String nombre, int edad, String carnet, Coche c, String despacho, String horarioTutorias, int nomina) {
		super(carnet, nombre, edad, c);
		this.despacho = despacho;
		this.horarioTutorias = horarioTutorias;
		this.nomina = nomina;
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

	public int getNomina() {
		return nomina;
	}

	public void setNomina(int nomina) {
		this.nomina = nomina;
	}
	
	// Metodos
	public String getConsultas() {
		return getNombre() + " tiene tutoria los " + horarioTutorias + " en la sala de " + despacho;
	}

	@Override
	public void menuIntranet() {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Bienvenido al menú Intranet profesor, seleccione la operación que%ndesee hacer:%n1-Ver la información del profesor%n2-Ver nómina del profesor%n3-¿A qué actividades eportivas desea apuntarse?%n4-SALIR%n");
		switch (sc.nextInt()) {
		case 1:
			System.out.println(super.getNombre());
			System.out.println(super.getEdad());
			System.out.println(despacho);
			System.out.println(horarioTutorias);
			break;

		case 2:
			System.out.println(nomina);
			break;
		case 3:
			System.out.println("Introduce  las actividades a las que te quieres apuntar");
			String act = sc.nextLine();
			break;
		case 4:
			System.out.println("HASTA LUEGO! Gracias por utilizar la Intranet de profesor");
			break;
		}
	
	}

}
