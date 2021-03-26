package Bolentin_Extra_t4;

import java.util.Scanner;

public class b8 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int valorA;
		double resu = 0;
		
		System.out.print("Dime el valor del vector: ");
		valorA = sc.nextInt();
		
		double[] aleatorio = new double[valorA];
		
		vectAleatorio(aleatorio);
	}
	
	public static void vectAleatorio(double vA[]) {
		
		for (int i = 0; i < vA.length; i++) {
			vA[i] = Math.random();
		}
		
		for (int i = 0; i < vA.length; i++) {
			System.out.println(vA[i]);
		}
	}

}
