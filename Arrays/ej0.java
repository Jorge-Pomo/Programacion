package Arrays;

import java.util.Scanner;

public class ej0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//VARIABLES
		
		int[] temperaturas = new int[10];
		int temp;
		
		int posi = 0;
		int contP = 0;
		
		int nega = 0;
		int contN = 0;
		
		//ALGORITME
		
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("Dime una temperatura: ");
			temp = sc.nextInt();
			
			//Calculo media
			if(temp > 0) {
				posi = temp + posi;
				contP++;
			}else {
				nega = temp + nega;
				contN++;
			}
			
			//Array
			temperaturas[i] = temp; 
		}
		
		//Calculo media
		posi = posi / contP;
		nega = nega / contN;
		
		System.out.println("LA media de positivas es = "+posi);
		System.out.println("LA media de negatias es = "+nega);
	}

}
