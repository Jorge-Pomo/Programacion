package Funciones;

import java.util.Scanner;

public class ej7 {
	/* 
	 * Escriba una funci�n que dado dos n�meros (base y altura), 
	 * dibuje un rect�ngulo. Ejemplo: base= 4 altura=2
	 */
	
	static Scanner sc = new Scanner(System.in);
	
	public static void rectangulo(int base, int altura) {
		
		for (int i = 1; i <= altura; i++) {
			for (int j = 1; j <= base; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int base;
		int altura;
		
		System.out.println("Dime la base del rect�ngulo:");
		base = sc.nextInt();
		System.out.println("Dime la altura del rect�ngulo:");
		altura = sc.nextInt();
		
		rectangulo(base, altura);
		
	}

}
