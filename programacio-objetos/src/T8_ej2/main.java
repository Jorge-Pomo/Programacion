package T8_ej2;

import T6_ej1.Coche;
import T8_ej0.Profesor;

public class main {

	public static void main(String[] args) {
		Coche c1 = new Coche("Renault", "Rojo", "Clio");
		Coche c2 = new Coche("Opel", "Blanco", "Corsa");
		
		Profesor prof1 = new Profesor("Fernando", 45, c2, "D104", "Lunes de 10:00 a 13:00");
	}

}
