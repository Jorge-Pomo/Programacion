package Bolentin_Extra_t4;

import java.util.Scanner;

public class b9 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Dime tu DNI: ");
		int dni = sc.nextInt();

		System.out.println(letraDNI(dni));
	}

	public static char letraDNI(int dni) {

		String sletras = "TRWAGMYFPDXBNJZSQVHLCKE";
		char[] letras = sletras.toCharArray();

		return letras[dni % 23];
	}

}
