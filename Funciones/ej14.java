package Funciones;

import java.util.Scanner;

public class ej14 {

	static Scanner sc = new Scanner(System.in);
	
	public static void multiplicar(int num) {
		for (int i = 1; i < 11; i++) {
			System.out.println(i+" * "+num+" = "+num*i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		
		System.out.println("Dime un número");
		num = sc.nextInt();
		
		multiplicar(num);
	}

}