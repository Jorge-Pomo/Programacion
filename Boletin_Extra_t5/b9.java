package Boletin_Extra_t5;

import java.util.Scanner;

public class b9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Variables
		int valor;
		int incremento;
		int tama�o;
		
		//Recogemos los datos indicados
		System.out.println("Dime el valor, "+"el incremento y "+"el tama�o del array.");
		valor = sc.nextInt();
		incremento = sc.nextInt();
		tama�o = sc.nextInt();
		
		//Creamos el vector
		int[] aritmetica = new int [tama�o];
		aritmetica[0] = valor;
		
		//Llenamos el vector
		for (int i = 1; i < aritmetica.length; i++) {
			valor = valor + incremento; 
			aritmetica[i] = valor;
		}
		
		//Leemos el vector
		for (int i = 0; i < aritmetica.length; i++) {
			System.out.println(aritmetica[i]);
		}
		
	}

}
