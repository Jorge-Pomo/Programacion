package Bolentin_Extra_t4;

import java.util.Scanner;

public class b5 {

	static Scanner sc = new Scanner(System.in);
	
	public static boolean fecha(int dias, int mes, int a�o) {
		boolean resu = false;
		
		if(dias <= 30 && mes <= 12) {
			resu = true;
		}else {
			resu = false;
		}
		
		return resu;
	}
	
	public static void main(String[] args) {
		int dias;
		int mes;
		int a�o;
		boolean resu = false;
		
		System.out.println("Dime dias");
		dias = sc.nextInt();
		System.out.println("Dime mes");
		mes = sc.nextInt();
		System.out.println("Dime a�o");
		a�o = sc.nextInt();
		
		resu = fecha(dias, mes, a�o);
		if(resu == true) {
			System.out.println("La fecha es correcta.");
		}else {
			System.out.println("La fecha es incorrecta.");
		}
	}

}
