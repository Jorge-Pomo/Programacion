package T8_ej2;

import T6_ej1.Coche;

public class main {

	public static void main(String[] args) {
		Coche c1 = new Coche("Renault", "Rojo", "Clio");
		Coche c2 = new Coche("Opel", "Blanco", "Corsa");
		
		Profesor prof1 = new Profesor("Fernando", 45, c2, "D104", "Lunes de 10:00 a 13:00");
		ProfesorEnfermo profEnf1 = new ProfesorEnfermo("jorge", 26, c1, "D689", "Martes de 10 a 13:00");
		
		System.out.println(prof1.getConsultas());
		System.out.println(profEnf1.getConsultas());
	}

}
