package Boletin_Extra_t5;

import java.util.Scanner;

public class b8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int valor;
		int posicion;

		char opc;
		int cas = 0;
		
		// Creamos y llenamos el Array de 10 enteros
		int[] enteros = new int[10];
		for (int i = 0; i < enteros.length; i++) {
			enteros[i] = i;
		}

		do {
			System.out.println("a. Mostrar valores.");
			System.out.println("b. Introducir valor.");
			System.out.println("c. Salir.");
			System.out.println("Selecciona entre a, b o c");
			opc = sc.next().charAt(0);
			
			if(opc == 'a') {
				cas = 1;
			}else {
				if(opc == 'b') {
					cas = 2;
				}else{
					cas = 3;
				}
			}
			
			switch (cas) {
			case 1: {
				for (int i = 0; i < enteros.length; i++) {
					System.out.print(enteros[i]+" ");
				}
				System.out.println();
				break;
			}
			case 2: {
				System.out.println("Dime que valor quieres introducir" + " y en que posicion");
				valor = sc.nextInt();
				posicion = sc.nextInt();

				enteros[posicion] = valor;
				break;
			}
			case 3: {
				break;
			}
			}
		} while (cas != 3);

	}

}
