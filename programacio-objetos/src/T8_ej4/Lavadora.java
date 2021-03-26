package T8_ej4;

/**
*
* @autor: Jorge Pomo Ramón
* Ejercicio 4 Tema 8 – Herencia
* 1r DAM-PROG
* 
*/

public class Lavadora extends Electrodomesticos {

	// Atributo
	private int carga;

	// Constructor
	public Lavadora() {
		this.carga = 5;
	}

	public Lavadora(int precioBase, int peso) {
		super(precioBase, peso);
		this.carga = 5;
	}

	public Lavadora(int precioBase, int peso, String color, char consumoElectrico, int carga) {
		super(precioBase, peso, color, consumoElectrico);
		this.carga = carga;
	}

	// Getters && Setters
	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	// Metodos
	@Override
	public double precioFinal() {
		double resu = super.precioFinal();
		if (carga > 30) {
			resu = resu + 50;
		}

		return resu;
	}

}
