package Funciones;

import java.util.Scanner;

public class ej9 {

	static Scanner sc = new Scanner(System.in);

	/*
	 * Dise�ar un programa que, dado un 
	 * n�mero positivo, devuelva el n�mero ded�gitos.
	 */

	public static int numDigitos(int num) {
		int resu = 0;
		int cont = num;

		while(num != 0) {
			num = num / 10;
			resu++;
		}

		return resu;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;


		System.out.println("Dime un n�mero positivo:");
		num = sc.nextInt();

		do {
			if(num < 0) {
				System.err.println("Error, el numero es negativo!!");

				System.out.println("Dime un n�mero positivo:");
				num = sc.nextInt();
			}
		}while(num < 0);

		int resu = numDigitos(num);
		System.out.println("El n�mero tiene, "+resu+" digitos");

	}

}
