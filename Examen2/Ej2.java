package Examen2;

import java.util.Scanner;

public class Ej2 {
	
	// EJERCICIO 2
	
	static Scanner sc = new Scanner(System.in);

	public static int[] llenarArray(int valor) {
		int[] v = new int[valor];
		int n;

		for (int i = 0; i < v.length; i++) {
			System.out.println("Dime que numero quieres introducir");
			v[i] = sc.nextInt();
		}
		return v;
	}

	public static int[] multiplosDe3(int[] array, int valor) {
		int[] mD3 = new int[valor];

		// Metemos todos los multiplos de 3 en el vector "mD3" en la misma posicion
		// en la que se encuentran
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 3 == 0) {
				mD3[i] = array[i];
			}
		}
		return mD3;
	}

	public static void main(String[] args) {

		System.out.println("Dime el numero de elementos");
		int n = sc.nextInt();

		// Llenamos el array1
		int[] array1 = new int[n];
		array1 = llenarArray(n);

		// Imprimimos los multiplos de 3
		System.out.println();
		System.out.println("Los números del array múltiplos de 3 son los siguientes:");
		int[] resu = multiplosDe3(array1, n);
		for (int i = 0; i < resu.length; i++) {
			if (resu[i] != 0) {
				System.out.println("v[" + i + "] = " + resu[i]);
			}
		}
	}

}