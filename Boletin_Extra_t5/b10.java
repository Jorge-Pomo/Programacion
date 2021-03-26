package Boletin_Extra_t5;

public class b10 {

	public static void main(String[] args) {
		int numeros [][] = new int[5][5];
		int cont = 1;
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				numeros[i][j] = cont;
				
				System.out.print(numeros[i][j] + " ");
				cont++;
			}
			System.out.println();
		}
	}

}
