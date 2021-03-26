package T6_ej6;

public class main {

	public static void main(String[] args) {
		
		Cancion Vvida = new Cancion("La Vie En Rose","Edith Piaf");

		System.out.println(Vvida.getTitulo() + " " + Vvida.getAutor());
		System.out.println(Vvida.dameTitulo());
		System.out.println(Vvida.dameAutor());
		
		Vvida.ponAutor("Louis Amstrong");
		Vvida.ponTitulo("What A Wonderfull World");
		System.out.println(Vvida.getTitulo() + " " + Vvida.getAutor());
		
		System.out.println(Vvida.dameTitulo());
		System.out.println(Vvida.dameAutor());
	}

}
