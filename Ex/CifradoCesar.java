package Ex;

public class CifradoCesar {

	public static void main(String[] args) {
		String palabra = "cabezay";
		int nCifrado = 2;

		System.out.println(cifradoCesar(palabra, nCifrado));
	}

	public static String cifradoCesar(String palabra, int posicion) {
		String letras = "abcdefghijklmnopqrstuvwxyz";
		String pCifrada = "";
		int posi2 = 0;

		for (int i = 0; i < palabra.length(); i++) {
			if (letras.indexOf(palabra.charAt(i)) + posicion >= letras.length()) {
				posi2 = (letras.indexOf(palabra.charAt(i)) + posicion) - letras.length();

				pCifrada = pCifrada + letras.charAt(posi2);
			} else {
				pCifrada = pCifrada + letras.charAt(letras.indexOf(palabra.charAt(i)) + posicion);
			}
		}

		return pCifrada;
	}

}
