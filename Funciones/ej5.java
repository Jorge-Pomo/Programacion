package Funciones;

import java.util.Scanner;

public class ej5 {

	//Escriba una funci�n que devuelva la suma 
	//de los n primeros n�meros impares.

	static Scanner sc = new Scanner(System.in);

	public static int impares(int num) {
		int resu = 0;
		int suma = 1;

		for (int i = 0; i < num; i++) {
			if(i % 2 != 0) {
				suma = i + suma;
			}
		}

		resu = suma;

		return resu;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;

		System.out.println("Dime un n�mero: ");
		num = sc.nextInt();

		int resu = impares(num);

		System.out.println(resu);

	}

}
