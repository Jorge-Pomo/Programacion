package Bolentin_Extra_t4;

import java.util.Scanner;

public class b2 {

	static Scanner sc = new Scanner (System.in);
	
	public static double millas_a_kilometros(int millas) {
		double resu = 0;
		double kilometros = 1.60934;
		
		resu = millas * kilometros;
		
		return resu;
	}
	
	public static void main(String[] args) {
		int millasM;
		double resu = 0;
		
		System.out.println("Dime cuantas millas");
		millasM = sc.nextInt();
		
		resu = millas_a_kilometros(millasM);
		System.out.println(resu);
		
	}

}
