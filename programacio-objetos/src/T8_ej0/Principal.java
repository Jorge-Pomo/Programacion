package T8_ej0;

import T6_ej1.Coche;

public class Principal {

	public static void main(String[] args) {
		Coche c1 = new Coche("Renault", "Rojo", "Clio");
		Coche c2 = new Coche("Opel", "Blanco", "Corsa");

		Estudiante est1 = new Estudiante("Juan", 20, c1, 12345, "1DAM");
		Profesor prof1 = new Profesor("Fernando", 45, c2, "D104", "Lunes de 10:00 a 13:00");

		double[] notas = { 7, 8.5, 4, 8, 6, 7.5, 5 };
		est1.setNotas(notas);

		System.out.println(est1.getNombre() + " " + est1.getNotaMedia());
		System.out.println(prof1.getNombre() + " " + prof1.getConsultas());
	}

}
