package Bolentin_Extra_t4;

import java.util.Scanner;

public class b10 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int vx;
		int vy;
		int vz;		
		
		System.out.println("Dime el valor de x");
		vx = sc.nextInt();
		System.out.println("Dime el valor de y");
		vy = sc.nextInt();
		System.out.println("Dime el valor de z");
		vz = sc.nextInt();
		
		System.out.println(pitagoras(vx, vy, vz));
	}
	
	public static boolean pitagoras(int x, int y, int z) {
		return (Math.pow(x, 2) + Math.pow(y, 2) == Math.pow(z, 2))? true : false;
	}

}
