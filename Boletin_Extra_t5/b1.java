package Boletin_Extra_t5;

import java.util.Scanner;

public class b1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] diezNum = new int[10];

		for (int i = 0; i < diezNum.length; i++) {
			System.out.println("Dime un núm");
			diezNum[i] = sc.nextInt();
		}
		
		for (int i = 0; i < diezNum.length; i++) {
			System.out.print(diezNum[i]);
		}
	}

}
