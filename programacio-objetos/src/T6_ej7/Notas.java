package T6_ej7;

import java.util.Scanner;

public class Notas {

	//Atributos
	private double[] notas = new double[5];
	
	//Cconstructores
	public Notas() {
		this.notas = notas;
	}
	
	//Getters & Setters
	public void setNotas(double notas) {
		for (int i = 0; i < this.notas.length; i++) {
			this.notas[i] = notas;
		}
	}
	public double[] getNotas() {
		return notas;
	}
	
	//Metodos
	public void leer() {
		double nota;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Dime nota");
			nota = sc.nextDouble();
			
			this.notas[i] = nota;
		}
	}
	
	public double media() {
		double media = 0;
		for (int i = 0; i < notas.length; i++) {
			media = this.notas[i] + media;
		}
		
		media = media / notas.length;
		return media;
	}
	
	public void  Mostrar() {
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Nota asignatura " + (i+1) + " = " + this.notas[i]);
		}
	}
	
	
}
