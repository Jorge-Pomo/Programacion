package T6_ej9;

import java.util.Scanner;

public class Temperaturas {

	//Atributos
	private double[] temp = new double [31];
	
	//Constructores
	public Temperaturas() {
		for (int i = 0; i < temp.length; i++) {
			temp[i] = 0;
		}
	}
	
	//Getters && Setters
	public void temp(double[] temp) {
		this.temp = temp; 
	}
	
	public double[] temp() {
		return temp;
	}
	
	//Metodos
	public void leer() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < temp.length; i++) {
			System.out.print("Dime las temperaturas:");
			temp[i] = sc.nextDouble();
		}
		
	}
	
	public double media() {
		double resu = 0;
		for (int i = 0; i < temp.length; i++) {
			resu = resu + temp[i];
		}
		
		resu = resu/temp.length;
		
		return resu;
	}
	
	public void mostrar() {
		for (int i = 0; i < temp.length; i++) {
			System.out.println("Tª dia " + (i+1) + " = " + temp[i]);
		}
	}
	
	public double maxima() {
		double resu = temp[0];
		
		for (int i = 0; i < temp.length; i++) {
			if(resu < temp[i]) {
				resu = temp[i];
			}
		}
		
		return resu;
	}
	
	public double minima() {
		double resu = temp[0];
		
		for (int i = 0; i < temp.length; i++) {
			if(resu > temp[i]) {
				resu = temp[i];
			}
		}
		
		return resu;
	}
}
