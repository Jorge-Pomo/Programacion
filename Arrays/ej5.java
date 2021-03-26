package Arrays;

import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String[] nombres = new String[10];
		int[] sueldos = new int [10];
		
		String nom;
		int dinero;
		
		int mayor = 0;
		int cont = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Dime tu nombre:");
			nom = sc.nextLine();
			nombres[i] = nom;
			
			System.out.println("Dime tu sueldo:");
			dinero = sc.nextInt();
			sueldos[i] = dinero;
			sc.nextLine();
		}
		
		for (int i = 0; i < sueldos.length; i++) {
			if(sueldos[i] > mayor) {
				mayor = sueldos[i];
				cont = i;
			}
		}
		System.out.println(nombres[cont]);
		System.out.println(sueldos[cont]);
		
	}

}
