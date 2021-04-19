package T8_ej5;

public class Principal {

	public static void main(String[] args) {

		Producto[] productos = new Producto[6];

		//Array
		productos[0] = new Perecedero(2, "Zanaorias", 3);
		productos[1] = new Perecedero(4, "Melocoton", 4.5);
		productos[2] = new Perecedero(1, "Platano", 2.3);
		productos[3] = new NoPerecedero("Bolleria", "Donuts", 0.5);
		productos[4] = new NoPerecedero("Chuches", "chicles", 1);
		productos[5] = new NoPerecedero("Pasta", "macarrones", 0.5);
		
		//Calculo de precio
		for (int i = 0; i < productos.length; i++) {
			System.out.println(productos[i].toString());
			System.out.println(productos[i].calcular(5));
		}
		
	}

}
