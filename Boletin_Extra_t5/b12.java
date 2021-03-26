package Boletin_Extra_t5;

import java.util.Scanner;

public class b12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime el numero de filas");
		int filas = sc.nextInt();
		System.out.println("Dime el numero de columnas");
		int columnas = sc.nextInt();

		int mayMen[][] = new int[filas][columnas];

		int mayor[] = new int[(int) ((filas * columnas) / 1.5)];
		int contMay = 0;
		int menor[] = new int[(int) ((filas * columnas) / 1.5)];
		int contMen = 0;

		for (int i = 0; i < mayMen.length; i++) {
			for (int j = 0; j < mayMen[i].length; j++) {
				System.out.println("Dime valor");
				
				int v = sc.nextInt();
				mayMen[i][j] = v;
			}
		}

		for (int i = 0; i < mayMen.length; i++) {
			for (int j = 0; j < mayMen.length; j++) {
				if (mayMen[i][j] > 0) {
					mayor[contMay] = mayMen[i][j];
					contMay++;
				} else {
					menor[contMen] = mayMen[i][j];
					contMen++;
				}
			}
		}

		for (int i = 0; i < menor.length; i++) {
			if (mayor[i] != 0) {
				System.out.print(mayor[i] + " ");
			}
		}
		System.out.println();
		for (int i = 0; i < menor.length; i++) {
			if (menor[i] != 0) {
				System.out.print(menor[i] + " ");
			}
		}

	}

}
