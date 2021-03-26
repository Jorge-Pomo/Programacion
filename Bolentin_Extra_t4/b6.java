package Bolentin_Extra_t4;

import java.util.Scanner;

public class b6 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int pNormal;
		int pDescuento;
		double resu = 0;
		
		System.out.println("Dime el precio sin el descuento");
		pNormal = sc.nextInt();
		System.out.println("Dime el pecio con el descuento");
		pDescuento = sc.nextInt();
		
		resu = porcentajeDescuento(pNormal, pDescuento);
		
		System.out.println(resu+"%");

	}
	
	public static double porcentajeDescuento(int sinDesc, int conDesc) {
		int resu = 0;
		
		resu = (conDesc*100)/sinDesc;
		
		return resu;
	}

}
