package Bolentin_Extra_t4;

import java.util.Scanner;

public class b4 {

	static Scanner sc = new Scanner(System.in);
	
	public static int suma1aN(int n) {
		int resu = 0;
		
		for (int i = 1; i <= n; i++) {
			resu = resu + i;
		}
		
		return resu;
	}
	
	public static int producto1aN(int n) {
		int resu = 1;
		
		for (int i = 1; i <= n; i++) {
			resu = resu * n;
		}
		return resu;
	}
	
	public static double intermedio1aN(int n) {
		double resu = 0;
		
		resu = (n-1) / 2;
		
		return resu;
	}
	
	public static void main(String[] args) {
		int n;
		int resu1;
		int resu2;
		double resu3;
		
		System.out.println("Dime el valor de 'n'");
		n = sc.nextInt();
		
		//Sumatorio
		resu1 = suma1aN(n);
		System.out.println(resu1);
		
		//Productorio
		resu2 = producto1aN(n);
		System.out.println(resu2);
		
		//Intermedio
		resu3 = intermedio1aN(n);
		System.out.println(resu3);
	}

}
