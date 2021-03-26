package Boletin_Extra_t5;

public class b11 {

	public static void main(String[] args) {
		int multiplicar [][] = new int[10][10];
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < multiplicar[i].length; j++) {
				multiplicar[i][j] = (i+1)*(j+1); 
				
				System.out.printf("%5d",multiplicar[i][j]);
			}
			System.out.println();
		}
		
	}

}
