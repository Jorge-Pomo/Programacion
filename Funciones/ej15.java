package Funciones;

import java.util.Scanner;

public class ej15 {

	static Scanner sc = new Scanner(System.in);
	
	public static int cuadrado(int valor) {
		int resu = 0;
		
		for (int i = 1; i <= valor; i++) {
			for (int j = 1; j <= valor; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		return resu;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int resu;
		
		System.out.println("dime un número:");
		num = sc.nextInt();
		
		resu = cuadrado(num);
	}

}
