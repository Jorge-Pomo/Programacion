package T6_ej8;

public class main {

	public static void main(String[] args) {
		DNI jorge = new DNI(20864744);

		System.out.println(jorge.getNum());
		System.out.println(jorge.getLet());
		
		jorge.leer();
		System.out.println(jorge.getNum());
		System.out.println(jorge.getLet());
		System.out.println(jorge.toString());
	}

}
