package T6_ej4;

public class principal {

	public static void main(String[] args) {
		Cafetera caf1 = new Cafetera();
		
		System.out.println("Cafetera nueva");
		System.out.println(caf1.getCantidadActual());
		System.out.println(caf1.getCapacidadMaxima());

		caf1.llenarCafetera();
		System.out.println();
		System.out.println("Cafetera llena");
		System.out.println(caf1.getCantidadActual());
		System.out.println(caf1.getCapacidadMaxima());
		
		caf1.servirTaza(300);
		System.out.println();
		System.out.println("Servimos una taza de 300ml");
		System.out.println(caf1.getCantidadActual());
		System.out.println(caf1.getCapacidadMaxima());
		
		caf1.servirTaza(800);
		System.out.println();
		System.out.println("Servimos una taza de 800ml más");
		System.out.println(caf1.getCantidadActual());
		System.out.println(caf1.getCapacidadMaxima());
		
		caf1.llenarCafetera();
		System.out.println();
		System.out.println("Cafetera llena");
		System.out.println(caf1.getCantidadActual());
		System.out.println(caf1.getCapacidadMaxima());
		
		caf1.vaciarCafetera();
		System.out.println();
		System.out.println("Vaciamos cafetera");
		System.out.println(caf1.getCantidadActual());
		System.out.println(caf1.getCapacidadMaxima());
		
		caf1.agregarCafe(900);
		System.out.println();
		System.out.println("Agregamos 900ml de cafe");
		System.out.println(caf1.getCantidadActual());
		System.out.println(caf1.getCapacidadMaxima());
	}

}
