package T6_ej1_1;

public class Main {

	public static void main(String[] args) {
		Contador c = new Contador();

		c.setCont(3);
		System.out.println(c.getCont());

		c.incrementar(7);
		System.out.println(c.getCont());
		
		c.decrementar(11);
		System.out.println(c.getCont());
		
		c.incrementar(8);
		c.decrementar(7);
		System.out.println(c.getCont());
	}

}
