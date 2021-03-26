package Arrays;

import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//VARIABLES
		
		int[] media = new int[10];
		int num;
		
		int par = 0;
		int impar = 0;
		
		//ALGORITME
		
		//Introducir numeros al array
		for (int i = 0; i < media.length; i++) {
			System.out.println("Dime un numero: ");
			num = sc.nextInt();
			
			media[i] = num;
		}
		
		//Suma numeros pares/impares
		for (int i = 0; i < media.length; i++) {
			if (i % 2 == 0){
				par = par + media[i];
			}else {
				impar = impar + media[i];
			}
		}
		
		//Calculo media
		par = par / 5;
		impar = impar / 5;
		
		System.out.println("La media de las posiciones par es = "+ par);
		System.out.println("La media de las posiciones impar es = "+ impar);
	}

}
