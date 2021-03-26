package Arrays;

import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double[] numAleatorio = new double [10];
		
		for (int i = 0; i < numAleatorio.length; i++) {
			numAleatorio[i] = Math.random();
		}
		
		for (int i = 0; i < numAleatorio.length; i++) {
			System.out.printf("El número aleatorio guardado en la posición v[%d] = %.3f %n",i,numAleatorio[i]);
		}
	}

}
