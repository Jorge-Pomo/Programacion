package Boletin_Actividades;

import java.util.Scanner;

public class act24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		//VARIABLES
		
		int dia1;
		int dia2;
		
		int mes1;
		int mes2;
		int mes = 30;
		int mesr;
		
		int a�o1;
		int a�o2;
		int a�o = 360;
		int a�or;
		
		int diasDife;
		
		//ALGORITMO

		//Primera Fecha
		System.out.println("Primera fecha");
		
		System.out.println("Dime dia:");
		dia1 = teclado.nextInt();
		
		System.out.println("Dime mes:");
		mes1 = teclado.nextInt();
		
		System.out.println("Dime a�o:");
		a�o1 = teclado.nextInt();
		
		//Segunda Fecha
		System.out.println("Segunda fecha:");
		
		System.out.println("Dime dia:");
		dia2 = teclado.nextInt();
		
		System.out.println("Dime mes:");
		mes2 = teclado.nextInt();
		
		System.out.println("Dime a�o:");
		a�o2 = teclado.nextInt();
		
		//Calculo de diferencia

		diasDife = dia1-dia2;
		mesr = (mes1*mes) - (mes2*mes);
		diasDife= diasDife + mesr;
		a�or = (a�o1 * a�o) - (a�o2 * a�o);
		diasDife= diasDife + a�or;
		diasDife= diasDife + (2*(-1*diasDife));	//amb (2*(-1*diasDife) fem que sempre done el resultat positiu.
		System.out.println("La diferencia de dias es de "+diasDife);
		
	}

}
