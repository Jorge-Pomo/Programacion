package Funciones;

import java.util.Scanner;

public class ej17 {

	static Scanner sc = new Scanner(System.in);

	// Calculo de euros a dolares y libras
	public static int euros() {
		int euros;
		double dolar = 1.21;
		double libra = 0.89;
		
		return 0;
	}

	// Calculo de dolares a euros y libras
	public static int dolares() {
		return 0;
	}

	// Calculo de libras a dolares y euros
	public static int libras() {
		return 0;
	}

	public static void main(String[] args) {
		int divisa;

		do {
			//Recojida de datos
			System.out.println("Que quieres calcular? elije euros(1), dolares(2) o libras(3). 99 para salir.");
			divisa = sc.nextInt();

			if (divisa == 99) {
			} else {
				if (divisa == 1) {
					System.out.println(euros());
				} else {
					if (divisa == 2) {
						System.out.println(dolares());
					} else {
						System.out.println(libras());
					}
				}
			}
		} while (divisa != 99);
	}

}
