package T9_ej1;

public class principal {

	public static void main(String[] args) {
		Software sf1 = new Software('C', "antivirus", "bueno");
		Software sf2 = new Software('B', "juego", "ProgramaJuegos");
		
		Hardware hw1 = new Hardware('A', "placa", true);
		Hardware hw2 = new Hardware('B', "teclado", false);
		
		System.out.println(sf1.getPrecio());
		System.out.println(sf2.getPrecio());
		
		System.out.println(hw1.getPrecio());
		System.out.println(hw2.getPrecio());
	}

}
