package Ex;

public class Palindromo {

	public static void main(String[] args) {
		String palabra = "Logra Casillas allí sacar gol";

		// Invertir cadena
		System.out.println(invertirCadena(palabra));

		// Palabra palindroma
		System.out.println(esPalindromo(palabra) ? "Si" : "No");

		// Frase palindorma
		System.out.println(esPalindromoFrase("Isaac no ronca así") ? "Si" : "No");
	}

	public static String invertirCadena(String cadena) {
		String invertida = "";

		for (int i = cadena.length() - 1; i >= 0; i--) {
			invertida += cadena.charAt(i);
		}

		return invertida;
	}

	public static boolean esPalindromo(String palabra) {
		// Invertimos la palabra
		String palInvert = invertirCadena(palabra);

		// Pasamos las palabras a minuscula para poder compararlas
		palabra = palabra.toLowerCase();
		
		palInvert = palInvert.toLowerCase();

		return (palabra.equals(palInvert));
	}

	public static boolean esPalindromoFrase(String frase) {
		String fraseInvertida = invertirCadena(frase);

		frase = frase.toLowerCase();
		fraseInvertida = frase.toLowerCase();

		// Quitamos espacios de la frase
		frase = frase.replace(" ", "");
		fraseInvertida = fraseInvertida.replace(" ", "");

		return (frase.equals(fraseInvertida));
	}

}
