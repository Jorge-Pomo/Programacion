package Funciones;

import java.util.Scanner;

public class ej6 {

	/**
	 * Escribe un programa que realice el producto de n n�meros 
	 * consecutivos, introduciendo por teclado los dos
	 * l�mites inferior y superior de los n�meros a 
	 * multiplicar (incluyendo los l�mites en el producto)
	 */
	
	static Scanner sc = new Scanner(System.in);
	
	public static int producto(int num1, int num2) {
		int resu = 0;
		int producto = 1;
		
		for (int i = num1; i <= num2; i++) {
			producto = i * producto;
		}
		
		resu = producto;
		
		return resu;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		
		System.out.println("Dime el primer n�mero: ");
		num1 = sc.nextInt();
		
		System.out.println("Dime el segundo n�mero");
		num2 = sc.nextInt();
		
		int resu = producto(num1, num2);
		
		System.out.println(resu);
		
	}

}
