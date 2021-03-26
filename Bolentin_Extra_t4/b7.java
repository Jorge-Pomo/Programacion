package Bolentin_Extra_t4;

public class b7 {

	public static void main(String[] args) {
		int[] b7 = new int[100];
		int resuS = 0;
		int resuM = 0;

		// Array con los 100 primeros numeros naturales
		for (int i = 0; i < b7.length; i++) {
			b7[i] = i;
		}

		resuS = suma(b7);
		resuM = media(b7);
		
		System.out.println("La suma es: "+resuS);
		System.out.println("La media es: "+resuM);
		
	}

	public static int suma(int sum[]) {
		int resu = 0;
		
		for (int i = 0; i < sum.length; i++) {
			resu = resu + sum[i];
		}
		
		return resu;
	}

	public static int media(int media[]) {
		int resu = 0;

		for (int i = 0; i < media.length; i++) {
			resu = resu + media[i];
		}
		
		resu = resu / media.length;
		
		return resu;
	}

}
