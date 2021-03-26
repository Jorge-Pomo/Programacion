package T6_ej9;

public class main {

	public static void main(String[] args) {
		Temperaturas marzo = new Temperaturas();
		
		marzo.leer();
//		System.out.println(marzo.media());
//		System.out.println(marzo.maxima());
//		System.out.println(marzo.minima());
//		marzo.mostrar();
		
		RegistroMes jorge = new RegistroMes("Marzo", 2021, marzo);
		
		jorge.tooString();

		
		
	}

}
