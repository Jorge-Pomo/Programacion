package Boletin_Actividades;

import java.util.Scanner;

public class act12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		// Di si un n�mero es positivo o negativo
		
		// VARIABLES
		
		int num;
		int posneg;
		
		// ALGORITMO
		
		System.out.println("Dame un n�mero: ");
		num = teclado.nextInt();
		
		if(num >= 0) {
			System.out.println("El n�mero es positivo");
		}
		else {
			System.out.println("El n�mero es negativo");
		}
	}

}
