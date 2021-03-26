package Examen2;

import java.util.Scanner;

public class Ej4 {
	
	// EJERCICIO 4

	public static int[] suma(int[] numeros, int objetivo) {
		int rSuma = 0;
		int[] resu = new int[numeros.length];
		
		for (int i = 1; i < numeros.length; i++) {
			// Si la suma de los numeros del array en posición "i" no es igual al objetivo se guarda
			// en el vetor resu, el numero y la posicion del mismo.
			if (numeros[i-1] + numeros[i] == objetivo) {
				resu[i-1] = numeros[i-1];
				resu[i] = numeros[i];
			}
		}
		
		return resu;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el numero objetivo");
		int obj = sc.nextInt();
		
		System.out.println("Dime el valor del vector");
		int v = sc.nextInt();
		
		int[] vector = new int[v];
		
		// Llenamos el array
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Dime un numero");
			vector[i] = sc.nextInt();
		}
		
		// Mostramos el resultado
		int[] resu = suma(vector, obj);
		for (int i = 0; i < resu.length; i++) {
			if (resu[i] != 0) {
				System.out.println(i+" ");
			}
		}

	}

}
