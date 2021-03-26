package Boletin_Extra_t7;

import java.util.ArrayList;

public class Ej2 {

	public static void main(String[] args) {
		int numSize = (int)(Math.random()*(10-20+1)+20);
		int suma = 0;
		int media = 0;
		int max = 0;
		int min = 110;
		
		ArrayList<Integer> alea = new ArrayList<Integer>();
		
		
		for (int i = 0; i < numSize; i++) {
			alea.add((int)(Math.random()*(1-100+1)+100));
		}
		
		for(int obj:alea) {
			suma = suma + obj;
			if(max < obj) {
				max = obj;
			}
			if(min > obj) {
				min = obj;
			}
		}
		
		media = suma/alea.size();
		
		System.out.println("La suma del ArrayList es " + suma);
		System.out.println("La media del ArrayList es " + media);
		System.out.println("El máximo es " + max);
		System.out.println("El mínimo es " + min);
	}

}
