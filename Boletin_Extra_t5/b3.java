package Boletin_Extra_t5;

import java.util.Scanner;

public class b3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int vN;
		int vM;
		
		System.out.println("Dime el valor de la matric:");
		vN = sc.nextInt();
		System.out.println("Die el valor que quiere repetir:");
		vM = sc.nextInt();
		
		int[] vRepetido = new int[vN];
		
		for (int i = 0; i < vRepetido.length; i++) {
			vRepetido[i] = vM;
		}
		for (int i = 0; i < vRepetido.length; i++) {
			System.out.print(vRepetido[i]);
		}
		
	}

}
