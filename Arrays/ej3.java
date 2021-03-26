package Arrays;

import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] pares = new int[20];
		int cont = 0;
		
		for (int i = 0; i < pares.length; i++) {
			pares[i] = cont;
			cont = cont + 2;
		}

		for (int i = 0; i < pares.length; i++) {
			System.out.println(pares[i]);
		}
	}

}
