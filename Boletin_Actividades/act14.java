package Boletin_Actividades;

import java.util.Scanner;

public class act14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		// Pide 2 n�meros idi cual es mayor i si son iguales

		// VARIABLES

		int num1;
		int num2;

		// ALGORITMO

		System.out.println("Dime el primer n�mero: ");
		num1 = teclado.nextInt();

		System.out.println("Dime el segundo n�mero: ");
		num2 = teclado.nextInt();

		if(num1 == num2) {
			System.out.println(num1+" es igual a "+num2);
		}
		else {
			if(num1 > num2) {
				System.out.println(num1+" es mayor a "+num2);
			}
			else {
				System.out.println(num2+" es mayor a "+num1);
			}

		}


	}

}
