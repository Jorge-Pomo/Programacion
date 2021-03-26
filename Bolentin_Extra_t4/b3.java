package Bolentin_Extra_t4;

import java.util.Scanner;

public class b3 {

	static Scanner sc = new Scanner(System.in);
	
	public static double precioConIva(double precio) {
		double resu = 0;
		int iva = 25;
		double precio2;
		
		precio2 = precio*iva;
		resu = precio2 / 100;
		
		
		return resu;
	}
	
	public static void main(String[] args) {
		int precio;
		double resu;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Dime un precio");
			precio = sc.nextInt();
			
			resu = precioConIva(precio);
			System.out.println(resu);
		}
		
		
	}

}
