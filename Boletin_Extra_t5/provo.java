package Boletin_Extra_t5;

public class provo {

	public static int[] prue(int val) {
		int[] mat = new int [val];
		
		for (int i = 0; i < mat.length; i++) {
			mat[i] = i;
		}
		
		return mat;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int celda = 4;
		
		for (int i = 0; i < celda; i++) {
			System.out.println(prue(celda)[i]);
		}
		
	}

}
