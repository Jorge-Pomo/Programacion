package Funciones;

import java.util.Scanner;

public class ej16 {

	public static int rectangulo(int base, int altura) {
		return base * altura;
	}
	
	public static int triangulo(int base, int altura) {
		return (base * altura) / 2;
	}
	
	public static double circulo(int radio) {
		return Math.PI * Math.pow(radio, 2);
	}
	
	public static int hexagono(int lado) {
		return 6 * lado;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int forma = 0;
		int base;
		int altura;
		int radio;
		int lado;
		
		while(forma != 5) {
		
		System.out.println();
		System.out.println("Menu");
		System.out.println("1.- Area rectangulo");
		System.out.println("2.- Area triangulo");
		System.out.println("3.- Area circulo");
		System.out.println("4.- Area hexagono");
		System.out.println("para finalizar pulasr 99");
		System.out.print("Selecciona una opcion: ");
		
		forma = sc.nextInt();
		
		if(forma == 99){
			forma = 5;
		}
		
		switch (forma) {
		case 1:
			System.out.println("Dime la base");
			base = sc.nextInt();
			System.out.println("Dime la altura");
			altura = sc.nextInt();
			
			System.out.println("La area del rectangulo es: "+rectangulo(base, altura));
			break;
			
		case 2:
			System.out.println("Dime la base");
			base = sc.nextInt();
			System.out.println("Dime la altura");
			altura = sc.nextInt();
			
			System.out.println("La area del triangulo es: "+triangulo(base, altura));
			break;
			
		case 3:
			System.out.println("Dime el radio");
			radio = sc.nextInt();
			
			System.out.println("La area del circulo es: "+circulo(radio));
			break;
			
		case 4:
			System.out.println("Dime el lado");
			lado = sc.nextInt();
			
			System.out.println("La area del hexagono es: "+hexagono(lado));
			break;
			
		case 5:
			System.out.println("Fin");
			break;
		}
		
		}
	}

}
