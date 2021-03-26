package Arrays;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//VARIABLES
		
		int[] mediaProg = new int[12];
		int nota;
		int notaMedia = 0;
		
		//ALGORITME
		
		//Crear array
		for (int i = 0; i < mediaProg.length; i++) {
			System.out.println("Dime la nota de prog: ");
			nota = sc.nextInt();
			
			mediaProg[i] = nota;
		}
		
		//Suma de las notas
		for (int i = 0; i < mediaProg.length; i++) {
			nota = mediaProg[i];
			
			notaMedia = notaMedia + nota;
		}
		
		//Calculo de la nota media
		notaMedia = notaMedia / mediaProg.length;
		System.out.println("La nota media de prog es de = "+ notaMedia);
		
		//Alumnos con nota superior
		System.out.println("Los alumnos con nota superior a la media estan en la posición: ");
		
		for (int i = 0; i < mediaProg.length; i++) {
			if(mediaProg[i] > notaMedia) {
				System.out.println(mediaProg[i]);
			}
		}
		
	}

}
