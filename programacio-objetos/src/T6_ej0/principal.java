package T6_ej0;

public class principal {

	public static void main(String[] args) {

		Persona persona1 = new Persona("Pepe");
		persona1.setEdad(10);

		Persona persona3 = new Persona("Maria");
		persona3.setEdad(20);

		Persona persona2 = new Persona("Luis");
		persona2.setEdad(persona3.getEdad() - persona1.getEdad());

		System.out.println(persona1.getNombre());
		System.out.println(persona1.getEdad());

		System.out.println(persona2.getNombre());
		System.out.println(persona2.getEdad());

		System.out.println(persona3.getNombre());
		System.out.println(persona3.getEdad());
	}

}
