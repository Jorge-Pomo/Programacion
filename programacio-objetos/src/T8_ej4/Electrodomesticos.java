package T8_ej4;

/**
* Ejercicio 4 Tema 8 – Herencia
* 1r DAM-PROG
* 
* @author Jorge Pomo Ramón
* 
* @since 2021-04-14 
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
	
	/**
	 * Constructor con 4 parametros
	 * Crea un electrodomestico con su color, consumo, precio y peso por defecto
	 * 
	 * @param color indica el color por defecto (blanco)
	 * @param consumoElectrico indica el consumo por defecto (F)
	 * @param precioBase indica el precio por defecto (100)
	 * @param peso indica el peso por defecto (5)
	 */
	public Electrodomesticos() {
		color = "blanco";
		consumoElectrico = 'F';
		precioBase = 100;
		peso = 5;
	}

	
	/**
	 * Constructor que inicializa el precioBase y el peso
	 * @param precioBase inicializa el precio por defecto
	 * @param peso inicializa el peso por defecto
	 */
	public Electrodomesticos(int precioBase, int peso) {
		color = "blanco";
		consumoElectrico = 'F';
		this.precioBase = precioBase;
		this.peso = peso;
	}

	/**
	 * El usuario nicializa los atributos
	 * @param precioBase  El usuario indica el precio base
	 * @param peso El usuario indica el peso
	 * @param color El usuario indica el color
	 * @param consumoElectrico El usuario indica el consumo electrico
	 */
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
	/**
	 * Comprueba si el valor del consumo es valido, si no lo pone por defecto
	 * 
	 * @see ConsumoElectrico
	 */
	private void comprobarConsumo() {
		String letras = "ABCDEF";
		char[] letra = letras.toCharArray();

		if (Arrays.asList(letra).contains(this.consumoElectrico) == false) {
			consumoElectrico = 'F';
		}
	}

	/**
	 * Comprueba si el cloro es valido, si no lo pone por defecto.
	 * @see Color
	 */
	private void comprobarColor() {
		String[] colores = { "blanco", "negro", "rojo", "azul", "gris" };
		color.toLowerCase();

		if (Arrays.asList(colores).contains(this.color) == false) {
			color = "blanco";
		}
	}

	/**
	 * Devuelve el precio final del electrodomestico
	 * 
	 * Segun el consumo que tenga
	 * @return
	 * <ul>
	 * 	<li>A = 100</li>
	 * 	<li>B = 80</li>
	 *  <li>C = 60</li>
	 *  <li>D = 50</li>
	 *  <li>E = 30</li>
	 *  <li>F = 10</li>
	 * </ul>
	 * 
	 * Segun el peso que tenga
	 * <ul>
	 * 	<li>(<= 19) = 10</li>
	 * 	<li>(>=20 && <= 49) = 50</li>
	 * 	<li>(>= 50 && <= 79) = 80</li>
	 * 	<li>(> 79) = 100</li>
	 * </ul>
	 */
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
