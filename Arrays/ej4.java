package Arrays;

import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[10];
		int num;
		
		int numneg = 0;
		int zero = 0;
		int numpos = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Dime un número:");
			num = sc.nextInt();
			
			numeros[i] = num;
		}
		
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] == 0) {
				zero++;
			}else {
				if(numeros[i] > 0) {
					numpos++;
				}else {
					numneg++;
				}
			}
		}
		
		System.out.println("Numeros positivo  = "+numpos);
		System.out.println("Numeros negativos = "+numneg);
		System.out.println("Numeros igual a 0 = "+zero);
	}

}
