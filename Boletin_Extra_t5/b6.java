package Boletin_Extra_t5;

import java.util.Scanner;

public class b6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numEnteros = new int[100];
		
		for (int i = 0; i < numEnteros.length; i++) {
			numEnteros[i] = (int) (1 + Math.random() * 10);
		}
		
		System.out.println("Dime un valor");
		int v = sc.nextInt();

		for (int i = 0; i < numEnteros.length; i++) {
			if(v == numEnteros[i]) {
				System.out.println("El valor " + v + " se ve representado en las posiciones " + i + " del array.");
			}
		}
	}

}
