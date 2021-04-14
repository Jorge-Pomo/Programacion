package T8_ej4;

/**
*
* Ejercicio 4 Tema 8 – Herencia
* 1r DAM-PROG
* 
* @author Jorge Pomo Ramón
* 
* @since 2021-04-14 
* 
*/

public class Lavadora extends Electrodomesticos {

	// Atributo
	private int carga;

	// Constructor
	/**
	 * Constructor que inicializa la carga por defecto a 5
	 * @param carga La carga sera igual a 5
	 */
	public Lavadora() {
		this.carga = 5;
	}

	/**
	 * Constructor que inicializa el precio y el peso por defecto
	 * @param precioBase inicializa el precio por defecto
	 * @param peso inicializa el peso por defecto
	 * @see Electrodomesticos
	 */
	public Lavadora(int precioBase, int peso) {
		super(precioBase, peso);
		this.carga = 5;
	}

	/**
	 * Constructor inicializado por el usuario.
	 * @param precioBase El usuario indica el precio base
	 * @param peso El usuario indica el peso
	 * @param color El usuario indica el color
	 * @param consumoElectrico El usuario indica el consumo
	 * @param carga El usuario indica la carga
	 */
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
	/**
	 * Devuelve el precio final
	 * @return 
	 * <ul>
	 * 	<li>Si la carga es menor de 30, el precio extra es 0</li>
	 * 	<li>Si la carga es mayor de 30, el precio extra sera de +50</li>
	 *</ul>
	 */
	@Override
	public double precioFinal() {
		double resu = super.precioFinal();
		if (carga > 30) {
			resu = resu + 50;
		}

		return resu;
	}

}
