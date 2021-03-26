package T8_ej1;

public class principal {

	public static void main(String[] args) {
		Programador pro1 = new Programador(300, "Java", "Jorge", "20864744H", 18, false, 500.2);
		System.out.println(pro1.clasificacion());
		System.out.println(pro1.mostrarDatos());
		pro1.mostrarMensaje("Hola que tal");
		System.out.println(pro1.nivelProgramacion());
	}

}
