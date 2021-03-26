package Examen2;

import java.util.Scanner;

public class Ej3 {

	// EJERCICIO 3
	
	public static int[][] llenarMatriz(int v){
		int[][] matriz = new int[v][v];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random()*10);
			}
		}
		return matriz;
	}
	
	public static void mostrarM(int[][] matLL) {
		
		// Mostramos por pantalla la matriz
		for (int i = 0; i < matLL.length; i++) {
			for (int j = 0; j < matLL[i].length; j++) {
				System.out.printf("%3d",matLL[i][j]);
			}
			System.out.println();
		}
	}
	
	public static double mediaMatriz(int[][] mat) {
		int suma = 0;
		int suma2 = 0;
		int a = 0;
		int b = (mat.length)-1;;
		
		for (int i = 0; i < mat.length; i++) {
			
			// Con la variable Suma sumamos la matriz del 0-0 al 4-4
			// Con la variable Suma2 sumamos la matriz del 4-0 al 0-4
			
			//Con la variable a, hacemos un contador que se incrementara por cadavuelta del primer for
			//Con la variable b, vamos restando la posicion del mat.length, 
			// para poder hacer la diagonal inversa
			
			suma = suma + mat[a][a];
			suma2 = suma2 + mat[b][a];
			b--;
			a++;
		}
		
		// Restamosla posicion que se repite en la suma2
		suma2 = suma2 - mat[(mat.length/2)][mat.length/2];
		
		double resu = 0;
		
		resu = suma+suma2;
		
		// Con el mat.lenght*2, sacamos todas las posiciones que utilizamos. Para poider sacar la media despues.
		resu = resu/((mat.length*2)-1);
		
		return resu;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dimension;
		System.out.println("Dime la dimensión de la matriz. Siempre de números impares.");
		dimension = sc.nextInt();
		
		int[][] matrizLlena = llenarMatriz(dimension);
		
		mostrarM(matrizLlena);
		
		System.out.println("La media de las diagonales es "+ mediaMatriz(matrizLlena));
	}

}