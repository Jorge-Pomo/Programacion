package Boletin_Actividades;

import java.util.Scanner;

public class act21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		//VARIABLES
		
		int dias;
		int mes;
		int a�o;
		
		//ALGORITMO
		
		System.out.println("Dime dias en numero: ");
		dias = teclado.nextInt();
		
		System.out.println("Dime mes: ");
		mes = teclado.nextInt();
		
		System.out.println("Dime a�o: ");
		a�o = teclado.nextInt();
		
		if(dias <= 30) {
			if(mes <= 12) {
				System.out.println("la fechas es "+dias+"-"+mes+"-"+a�o);
			}
		}else {
			System.err.println("Hay un error en los datos!!");
		}
		
	}
	
}
