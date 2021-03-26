package proves;

import java.util.Scanner;

public class Diccionario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//String amb l'oracio
		String oracion = "La ciudad de Alicante es la ciudad más bonita de Valencia";
		
		//Passem tota l'oracio a malluscula
		oracion = oracion.toUpperCase();
		
		//Passem el String a Array
		String[] oraSeparada = oracion.split("\\s");
		int[] cont = new int[oraSeparada.length];
		
		int contador = 1;
		
		//Amb este for comparem cada posisio del array per totes les altres. Si troba una igual suma al contador 1++ y el guarda enla posiso que esta.
		for (int i = 0; i < oraSeparada.length; i++) {
			for (int j = 0; j < oraSeparada.length; j++) {
				if(oraSeparada[i].equals(oraSeparada[j])) {
					cont[i] = contador++;
				}
			}
			contador = 1;
		}
		
		//For per mostrar el resultat
		for (int i = 0; i < oraSeparada.length; i++) {
				System.out.print(cont[i]);
				System.out.println(" "+oraSeparada[i]);
		}
		
	}

}
