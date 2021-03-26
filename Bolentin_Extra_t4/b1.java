package Bolentin_Extra_t4;

import java.util.Scanner;

public class b1 {

	static Scanner sc = new Scanner(System.in);

	public static boolean esMayorEdad(int a) {
		boolean resu = false;

		if(a >= 18) {
			resu = true;
		}else {
			resu = false;
		}

		return resu;
	}

	public static void main(String[] args) {
		int edad;
		boolean resultado = false;

		System.out.println("Dime tu edad:");
		edad = sc.nextInt();

		resultado = esMayorEdad(edad);

		if(resultado == true) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("No es mayor de edad");
		}
	}

}
