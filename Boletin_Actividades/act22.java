package Boletin_Actividades;

import java.util.Scanner;

public class act22 {

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
		
		//Mes de 28 Dias
		if(mes == 2) {
			if(dias < 29) {
				System.out.println("Es correcta!!");
			}else {
				System.err.println("La fecha es incorrecta :(");
			}
		}
		
		//Mes de 31 dies
		if((mes == 1)||(mes == 3)||(mes == 5)||(mes == 7)||(mes == 8)||(mes == 10)||(mes == 12)) {
			if(dias < 32) {
				System.out.println("Es correcta!!");
			}else {
				System.err.println("La fecha es incorrecta :(");
			}
		}
		
		//Mes de 30 dies
		if((mes == 4)||(mes == 6)||(mes == 9)||(mes == 11)) {
			if(dias < 31) {
				System.out.println("Es correcta!!");
			}else {
				System.err.println("La fecha es incorrecta :(");
			}
		}
	}

}
