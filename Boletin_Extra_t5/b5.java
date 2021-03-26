package Boletin_Extra_t5;

import java.util.Scanner;

public class b5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double[] numReales = new double[100];
		
		for (int i = 0; i < numReales.length; i++) {
			numReales[i] = Math.random();
		}
		
		System.out.println("Dime un valor real entre 0.0 y 1.0");
		double valorReal = sc.nextDouble();
		
		for (int i = 0; i < numReales.length; i++) {
			if(numReales[i] >= valorReal) {
				System.out.println(numReales[i]);
			}
		}
	}

}
