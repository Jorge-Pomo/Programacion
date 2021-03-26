package Funciones;

import java.util.Scanner;

public class ej13 {

	static Scanner sc = new Scanner(System.in);

	public static int contDig(int num) {
		int contador = 0;
		int numDig = 0;
		int cont = 0;

		numDig = num;

		while(numDig > 0) {
			numDig = numDig / 10;
			cont++;
		}
		contador = cont;
		
		return contador;
	}

	public static int sumaPares(int cont, int num) {
		int resu = 0;

		int[] pares = new int[cont];

		int divNum;
		int restNum;

		int suma = 0;
		
		divNum = num;
		restNum = num;

		for (int i = 0; i < pares.length; i++) {
			num = divNum % 10;
			divNum = divNum / 10;

			restNum = num;

			if(restNum % 2 == 0) {
				pares[i] = restNum;
			}
		}
		
		for (int i = 0; i < pares.length; i++) {
			suma = pares[i] + suma;
		}
		
		for (int i = pares.length; i <= 0; i--) {
			System.out.println(pares[i]);
		}
		
		return suma;
	}

	public static void main(String[] args) {
		int num;
		int resu = 0;


		System.out.println("Dime un número positivo:");
		num = sc.nextInt();

		resu = contDig(num);

		int resu2 = sumaPares(resu, num);
		
		System.out.println(resu2);
		
	}

}
