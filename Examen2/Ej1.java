package Examen2;
import java.util.Scanner;

public class Ej1 {

	// EJERCICIO 1
	
	// Funciones
	public static int sumar(int v1, int v2) {
		return v1 + v2;
	}

	public static int restar(int v1, int v2) {
		int resu = 0;

		if (v1 > v2) {
			resu = v2 - v1;
		} else {
			resu = v1 - v2;
		}

		return resu;
	}

	public static int multiplicar(int v1, int v2) {
		return v1 * v2;
	}

	public static double dividir(int v1, int v2) {
		return v1 / v2;
	}

	public static int[] multiplicar(int v) {
		int[] tabla = new int[10];
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = v * (i + 1);
		}
		return tabla;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opcion;

		// Menu
		System.out.println("Bienvenidos a nuestra calculadora para dos números enteros.");
		System.out.println("Introduzca el número correspondiente a la operación que desea realizar:");

		System.out.println();

		System.out.println("1. Sumar");
		System.out.println("2. Resatar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("5. Mostrar la tabla de multiplicar");
		System.out.println("6. Salir de la calculadora");
		opcion = sc.nextInt();

		// Variables
		int x;
		int y;

		while (opcion != 6) {
			switch (opcion) {
			case 1:
				System.out.println("Dime el primer valor," + "Dime el segundo valor.");
				x = sc.nextInt();
				y = sc.nextInt();
				System.out.println("La suma de " + x + " + " + y + " = " + sumar(x, y));
				break;
			case 2:
				System.out.println("Dime el primer valor," + "Dime el segundo valor.");
				x = sc.nextInt();
				y = sc.nextInt();
				System.out.println("La resta de " + x + " - " + y + " = " + restar(x, y));
				break;
			case 3:
				System.out.println("Dime el primer valor," + "Dime el segundo valor.");
				x = sc.nextInt();
				y = sc.nextInt();
				System.out.println("La multiplicación de " + x + " * " + y + " = " + multiplicar(x, y));
				break;
			case 4:
				System.out.println("Dime el primer valor," + "Dime el segundo valor.");
				x = sc.nextInt();
				y = sc.nextInt();
				
				// No se puede dividir entre 0
				if (y == 0) {
					System.err.println("No se puede dividir entre zero!!!");
				} else {
					System.out.println("La división de " + x + " / " + y + " = " + dividir(x, y));
				}
				break;
			case 5:
				System.out.println("Dime el numero que quiere multiplicar.");
				x = sc.nextInt();
				int[] tMultiplicar = multiplicar(x);

				System.out.println("La tabla de multiplicar de " + x + " es:");
				for (int i = 0; i < tMultiplicar.length; i++) {
					System.out.println(x + " x " + (i + 1) + " = " + tMultiplicar[i]);
				}
				break;
			}

			System.out.println("Introduzca otra operación a realizar");
			System.out.println("(1-Sumar;2-Restar;3-Multiplicar;4-Dividir;5-Tabla Multiplicar;6-Salir)");
			opcion = sc.nextInt();
			
		}
		
		// Fin del programa
		System.out.println("¡Mucha gracias por utilizar nuestra calculadora!");
		System.out.println("¡KEEP CALM & CODE JAVA!");
	}

}
