package T6_ej1;

public class principal {

	public static void main(String[] args) {
		
		Coche c1 = new Coche("Renault", "Clio", "Rojo");
		Coche c2 = new Coche("Ford", "Fiesta", "Azul");

		Persona persona1 = new Persona("Pepe");
		persona1.setEdad(10);
		persona1.setC(c1);
		
		Persona persona2 = new Persona("Luis");
		persona2.setEdad(25);
		persona2.setC(c1);
		
		Persona persona3 = new Persona("Maria");
		persona3.setEdad(20);
		persona3.setC(c2);
		
		System.out.println("El coche de "+persona1.getNombre()+" es el " + persona1.getC().getMarca());
		System.out.println("El coche de "+persona2.getNombre()+" es el " + persona2.getC().getMarca());
		System.out.println("El coche de "+persona3.getNombre()+" es el " + persona3.getC().getMarca());
		
	}

}
