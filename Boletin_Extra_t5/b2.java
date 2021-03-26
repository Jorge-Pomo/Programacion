package Boletin_Extra_t5;

import java.util.Scanner;

public class b2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] diezNum = new int[10];
		int max = 0;
		int min = 999999999;
		
		
		for (int i = 0; i < diezNum.length; i++) {
			System.out.println("Dime un núm");
			diezNum[i] = sc.nextInt();
		}

		for (int i = 0; i < diezNum.length; i++) {
			if (diezNum[i] > max) {
				max = diezNum[i];
			}
			
			if(diezNum[i] < min) {
				min = diezNum[i];
			}
		}
		
		System.out.println("El valor minimo es= "+min+", y el maximo es="+max);
		
	}

}
