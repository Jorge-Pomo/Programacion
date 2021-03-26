package Boletin_Extra_t5;

import java.util.Scanner;

public class b4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int vP;
		int vQ;

		System.out.println("Dime el valor de inicio:");
		vP = sc.nextInt();
		System.out.println("Dime el valor de fin:");
		vQ = sc.nextInt();

		int[] pAstaQ = new int[vQ - vP - 1];
		vP = vP+1;
		
		for (int i = 0; i < pAstaQ.length; i++) {
			pAstaQ[i] = vP++;
		}
		for (int i = 0; i < pAstaQ.length; i++) {
			System.out.print(pAstaQ[i]);
		}
	}

}
