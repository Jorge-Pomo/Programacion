package T8_ej4;

/**
*
* @autor: Jorge Pomo Ramón
* Ejercicio 4 Tema 8 – Herencia
* 1r DAM-PROG
* 
*/

import java.util.Arrays;

public class Electrodomesticos {

	// Atributos
	private int precioBase;
	private String color;
	private int peso;
	private char consumoElectrico;

	// Constructores
	public Electrodomesticos() {
		color = "blanco";
		consumoElectrico = 'F';
		precioBase = 100;
		peso = 5;
	}

	public Electrodomesticos(int precioBase, int peso) {
		color = "blanco";
		consumoElectrico = 'F';
		this.precioBase = precioBase;
		this.peso = peso;
	}

	public Electrodomesticos(int precioBase, int peso, String color, char consumoElectrico) {
		this.color = color;
		this.consumoElectrico = consumoElectrico;
		this.precioBase = precioBase;
		this.peso = peso;
	}

	// Getters && Setters
	public int getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public char getConsumoElectrico() {
		return consumoElectrico;
	}

	public void setConsumoElectrico(char consumoElectrico) {
		this.consumoElectrico = consumoElectrico;
	}

	// Métodos
	private void comprobarConsumo() {
		String letras = "ABCDEF";
		char[] letra = letras.toCharArray();

		if (Arrays.asList(letra).contains(this.consumoElectrico) == false) {
			consumoElectrico = 'F';
		}
	}

	private void comprobarColor() {
		String[] colores = { "blanco", "negro", "rojo", "azul", "gris" };
		color.toLowerCase();

		if (Arrays.asList(colores).contains(this.color) == false) {
			color = "blanco";
		}
	}

	public double precioFinal() {
		double resu = 0;

		switch (consumoElectrico) {
		case 'A':
			resu = resu + 100;
			break;
		case 'B':
			resu = resu + 80;
			break;
		case 'C':
			resu = resu + 60;
			break;
		case 'D':
			resu = resu + 50;
			break;
		case 'E':
			resu = resu + 30;
			break;
		case 'F':
			resu = resu + 10;
			break;
		}

		if (peso <= 19) {
			resu = resu + 10;
		} else {
			if (peso >= 20 && peso <= 49) {
				resu = resu + 50;
			} else {
				if (peso >= 50 && peso <= 79) {
					resu = resu + 80;
				} else {
					if (peso > 79) {
						resu = resu + 100;
					}
				}
			}
		}
		return resu;
	}

}
