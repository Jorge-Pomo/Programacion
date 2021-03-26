package Strings;

import java.util.Scanner;

public class Ac1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cont = 1;
		
		System.out.println("El String introducido por el usurio es:");
		String oracion = sc.nextLine();
		
		System.out.println("----------------------------------------------------");
		System.out.println(oracion);
		System.out.println("----------------------------------------------------");
		
		for (int i = 0; i < oracion.length(); i++) {
			char caracter = oracion.charAt(i);
			
			if (caracter == ' ') {
				cont++;
			}
		}
		
		System.out.println("En el String introducido hay: "+ cont +" palabras");
	}

}
