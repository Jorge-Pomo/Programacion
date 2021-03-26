package Ex;

import java.util.Scanner;

public class contraseña {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String pwd;

		System.out.println(contraAleatoria());
		
		pwd = contraAleatoria();

		System.out.println((esValida(pwd)) ? "Si" : "No");

		switch (algunError(pwd)) {
		case 1:
			System.err.println("La contraseña no cumple con la longitud");
			break;
		case 2:
			System.err.println("La contraseña no contiene una mayuscula");
			break;
		case 3:
			System.err.println("La contraseña no contiene una minuscula");
			break;
		case 4:
			System.err.println("La contraseña no contiene un número");
			break;
		case 5:
			System.err.println("La contraseña no contiene un caracter especial");
			break;
		}
		

	}

	public static boolean esValida(String contraseña) {

		boolean valida = true;

		String especiales = "%&*-+_/";
		boolean esp = false;

		boolean esNumero = false;
		boolean esMayuscula = false;
		boolean esMinuscula = false;

		// Longitud de la cadena
		if (contraseña.length() < 8) {
			valida = false;
		} else {

			for (int i = 0; i < contraseña.length(); i++) {

				// Numeros
				if (Character.isDigit(contraseña.charAt(i))) {
					esNumero = true;
				}

				// Mayuscula
				if (Character.isUpperCase(contraseña.charAt(i))) {
					esMayuscula = true;
				}

				// Minuscula
				if (Character.isLowerCase(contraseña.charAt(i))) {
					esMinuscula = true;
				}

				// Caracteres
				if (especiales.contains("" + contraseña.charAt(i))) {
					esp = true;
				}
			}

			valida = esNumero && esMayuscula && esMinuscula && esp;

		}

		return valida;
	}

	public static int algunError(String contraseña) {

		int codigo = 0;

		String especiales = "%&*-+_/";
		boolean esp = false;

		boolean esNumero = false;
		boolean esMayuscula = false;
		boolean esMinuscula = false;

		// Longitud de la cadena
		if (contraseña.length() < 8) {
			codigo = 1;
		} else {

			for (int i = 0; i < contraseña.length(); i++) {

				// Numeros
				if (Character.isDigit(contraseña.charAt(i))) {
					esNumero = true;
				}

				// Mayuscula
				if (Character.isUpperCase(contraseña.charAt(i))) {
					esMayuscula = true;
				}

				// Minuscula
				if (Character.isLowerCase(contraseña.charAt(i))) {
					esMinuscula = true;
				}

				// Caracteres
				if (especiales.contains("" + contraseña.charAt(i))) {
					esp = true;
				}
			}
		}

		if (!esMayuscula) {
			codigo = 2;
		}
		if (!esMinuscula) {
			codigo = 3;
		}
		if (!esNumero) {
			codigo = 4;
		}
		if (!esp) {
			codigo = 5;
		}

		return codigo;

	}
	
	public static String contraAleatoria() {
		
		//Datos necesarios para crear la contraseña
		String especiales = "%&*-+_/";
		String numeros = "1234567890";
		String letrasMin = "abcdefghijklmnopqrstuvwxyz";
		String letrasMay = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		//Convertimos los Strings a arrays de caracteres
		char[] esp = especiales.toCharArray();
		char[] num = numeros.toCharArray();
		char[] letMin = letrasMin.toCharArray();
		char[] letMay = letrasMay.toCharArray();
		
		//Creamos el string en el que guardaremos la contraseña
		char[] contra = new char[8];
		
		//Con Math.random, scamos una posicion aleatoria del array, i la introducimos en el array contra.
		for (int i = 0; i < contra.length; i++) {
			switch ((int) (Math.random()*4+1)) {
			case 1: {
				contra[i] = esp[(int) (Math.random()*esp.length)];
				break;
			}
			case 2: {
				contra[i] = num[(int) (Math.random()*num.length)];
				break;
			}
			case 3: {
				contra[i] = letMin[(int) (Math.random()*letMin.length)];
				break;
			}
			case 4:{
				contra[i] = letMay[(int) (Math.random()*letMay.length)];
			}
			}
		}
		
		String resu = new String(contra);
		
		return resu;
		
	}

}
