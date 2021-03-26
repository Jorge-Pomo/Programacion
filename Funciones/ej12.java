package Funciones;

import java.util.Scanner;

public class ej12 {

	static Scanner sc = new Scanner(System.in);
	
	public static int ele(int altura) {
		int resu = 0;
		int base = 0;
		
		for (int i = 0; i < (altura-1); i++) {
			System.out.println("*");
		}
		
		base = altura/2;
		base = base + 1;
		
		for (int i = 0; i < base; i++) {
			System.out.print("*");
		}
		
		return resu;
	}
	
	public static void main(String[] args) {
		int altura;
		int resu;
		
		
		System.out.println("Dime la altura de la L");
		altura = sc.nextInt();
		
		resu = ele(altura);
	}

}
