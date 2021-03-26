package Funciones;

import java.util.Scanner;

public class ej11 {

	/*
	 * Diseñar un programa que, dado un número positivo y un dígito, 
	 * diga en qué posición o posiciones aparece, 
	 * de izquierda a derecha (izda 1…).
	 */
	
	static Scanner sc = new Scanner(System.in);
	
	public static int posicion(int num) {
		int resu = 0;
		
		int numDigitos = num;
		int contDigitos = 0;
		
		while(numDigitos > 0) {
			numDigitos = numDigitos / 10;
			contDigitos++;
		}
	
		resu = contDigitos;
		
		return resu;
	}
	
	public static void main(String[] args) {
		int num;
		int digito;
		int resu = 0;
		
		int divNum;
		int restNum;
		
		
		System.out.println("Dime el número positivo:");
		num = sc.nextInt();
		
		System.out.println("Dime el digito: ");
		digito = sc.nextInt();
		
		resu = posicion(num);
		
		divNum = num;
		restNum = num;		
		
		int[] vectNum = new int[resu];
		
		for (int i = 0; i < vectNum.length; i++) {
			num = divNum % 10;
			divNum = divNum / 10;
			
			restNum = num;
			
			vectNum[i] = restNum;
		}
		
		for (int i = 0; i < vectNum.length; i++) {
			
		}
		
	}

}
